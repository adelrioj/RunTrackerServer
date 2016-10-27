package es.eina.tfg.RouteViewer.util;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.upload.UploadRequest;
import com.liferay.portal.kernel.util.PrefsPropsUtil;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.util.PortalUtil;
import org.apache.commons.io.FileUtils;

import java.io.File;

/**
 * File validation util class.
 *
 * @author adelrioj.
 */
public class FileValidator {

    /**
     * Checks if the file was not too big so that is was completely ignored
     *
     * @param request Portlet request
     * @param paramName param name of the file to check for
     * @throws IllegalArgumentException if file or file size is null or 0
     * @throws SystemException if {@link com.liferay.portal.kernel.util.PropsKeys#UPLOAD_SERVLET_REQUEST_IMPL_MAX_SIZE} cannot be loaded
     */
    public static void validateFileParamNotEmpty(UploadRequest request, String paramName)
            throws IllegalArgumentException, SystemException {
        File file = request.getFile(paramName, false);
        Long fileSize = request.getSize(paramName);
        if (file == null || fileSize == null || fileSize <= 0) {
            long companyId = PortalUtil.getCompanyId(request);
            long displaySizeOnPrefs;
            try {
                displaySizeOnPrefs = PrefsPropsUtil.getLong(companyId, PropsKeys.UPLOAD_SERVLET_REQUEST_IMPL_MAX_SIZE);
            } catch (SystemException e) {
                _log.error("SystemException while loading" +
                        " file: " + paramName +
                        " size: " + fileSize +
                        " with system max request size: " + PropsKeys.UPLOAD_SERVLET_REQUEST_IMPL_MAX_SIZE);
                throw e;
            }
            String maxUploadFileSize = FileUtils.byteCountToDisplaySize(displaySizeOnPrefs);
            throw new IllegalArgumentException(
                    "Please provide mandatory parameter '" + paramName + "' (file). " +
                            "Max upload size is set to " + maxUploadFileSize + " in this Liferay instance.");
        }
    }
    private static Log _log = LogFactoryUtil.getLog(FileValidator.class);
}
