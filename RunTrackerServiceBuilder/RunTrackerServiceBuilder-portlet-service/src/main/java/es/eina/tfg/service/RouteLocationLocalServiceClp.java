package es.eina.tfg.service;

import com.liferay.portal.service.InvokableLocalService;

/**
 * @author adelrioj
 * @generated
 */
public class RouteLocationLocalServiceClp implements RouteLocationLocalService {
    private InvokableLocalService _invokableLocalService;
    private String _methodName0;
    private String[] _methodParameterTypes0;
    private String _methodName1;
    private String[] _methodParameterTypes1;
    private String _methodName2;
    private String[] _methodParameterTypes2;
    private String _methodName3;
    private String[] _methodParameterTypes3;
    private String _methodName4;
    private String[] _methodParameterTypes4;
    private String _methodName5;
    private String[] _methodParameterTypes5;
    private String _methodName6;
    private String[] _methodParameterTypes6;
    private String _methodName7;
    private String[] _methodParameterTypes7;
    private String _methodName8;
    private String[] _methodParameterTypes8;
    private String _methodName9;
    private String[] _methodParameterTypes9;
    private String _methodName10;
    private String[] _methodParameterTypes10;
    private String _methodName11;
    private String[] _methodParameterTypes11;
    private String _methodName12;
    private String[] _methodParameterTypes12;
    private String _methodName13;
    private String[] _methodParameterTypes13;
    private String _methodName14;
    private String[] _methodParameterTypes14;
    private String _methodName15;
    private String[] _methodParameterTypes15;
    private String _methodName16;
    private String[] _methodParameterTypes16;
    private String _methodName17;
    private String[] _methodParameterTypes17;
    private String _methodName19;
    private String[] _methodParameterTypes19;
    private String _methodName20;
    private String[] _methodParameterTypes20;
    private String _methodName21;
    private String[] _methodParameterTypes21;
    private String _methodName22;
    private String[] _methodParameterTypes22;
    private String _methodName23;
    private String[] _methodParameterTypes23;

    public RouteLocationLocalServiceClp(
        InvokableLocalService invokableLocalService) {
        _invokableLocalService = invokableLocalService;

        _methodName0 = "addRouteLocation";

        _methodParameterTypes0 = new String[] { "es.eina.tfg.model.RouteLocation" };

        _methodName1 = "createRouteLocation";

        _methodParameterTypes1 = new String[] { "long" };

        _methodName2 = "deleteRouteLocation";

        _methodParameterTypes2 = new String[] { "long" };

        _methodName3 = "deleteRouteLocation";

        _methodParameterTypes3 = new String[] { "es.eina.tfg.model.RouteLocation" };

        _methodName4 = "dynamicQuery";

        _methodParameterTypes4 = new String[] {  };

        _methodName5 = "dynamicQuery";

        _methodParameterTypes5 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName6 = "dynamicQuery";

        _methodParameterTypes6 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
            };

        _methodName7 = "dynamicQuery";

        _methodParameterTypes7 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName8 = "dynamicQueryCount";

        _methodParameterTypes8 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName9 = "dynamicQueryCount";

        _methodParameterTypes9 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery",
                "com.liferay.portal.kernel.dao.orm.Projection"
            };

        _methodName10 = "fetchRouteLocation";

        _methodParameterTypes10 = new String[] { "long" };

        _methodName11 = "getRouteLocation";

        _methodParameterTypes11 = new String[] { "long" };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getRouteLocations";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getRouteLocationsCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateRouteLocation";

        _methodParameterTypes15 = new String[] { "es.eina.tfg.model.RouteLocation" };

        _methodName16 = "getBeanIdentifier";

        _methodParameterTypes16 = new String[] {  };

        _methodName17 = "setBeanIdentifier";

        _methodParameterTypes17 = new String[] { "java.lang.String" };

        _methodName19 = "add";

        _methodParameterTypes19 = new String[] {
                "java.lang.Long", "java.lang.Double", "java.lang.Double"
            };

        _methodName20 = "update";

        _methodParameterTypes20 = new String[] {
                "java.lang.Long", "java.lang.Long", "java.lang.Double",
                "java.lang.Double"
            };

        _methodName21 = "findByRouteId";

        _methodParameterTypes21 = new String[] { "java.lang.Long" };

        _methodName22 = "findByRouteId";

        _methodParameterTypes22 = new String[] { "long", "int", "int" };

        _methodName23 = "findByRouteIdCount";

        _methodParameterTypes23 = new String[] { "java.lang.Long" };
    }

    @Override
    public es.eina.tfg.model.RouteLocation addRouteLocation(
        es.eina.tfg.model.RouteLocation routeLocation)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName0,
                    _methodParameterTypes0,
                    new Object[] { ClpSerializer.translateInput(routeLocation) });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (es.eina.tfg.model.RouteLocation) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public es.eina.tfg.model.RouteLocation createRouteLocation(
        long routePositionId) {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName1,
                    _methodParameterTypes1, new Object[] { routePositionId });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (es.eina.tfg.model.RouteLocation) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public es.eina.tfg.model.RouteLocation deleteRouteLocation(
        long routePositionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName2,
                    _methodParameterTypes2, new Object[] { routePositionId });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
                throw (com.liferay.portal.kernel.exception.PortalException) t;
            }

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (es.eina.tfg.model.RouteLocation) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public es.eina.tfg.model.RouteLocation deleteRouteLocation(
        es.eina.tfg.model.RouteLocation routeLocation)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName3,
                    _methodParameterTypes3,
                    new Object[] { ClpSerializer.translateInput(routeLocation) });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (es.eina.tfg.model.RouteLocation) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName4,
                    _methodParameterTypes4, new Object[] {  });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (com.liferay.portal.kernel.dao.orm.DynamicQuery) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName5,
                    _methodParameterTypes5,
                    new Object[] { ClpSerializer.translateInput(dynamicQuery) });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName6,
                    _methodParameterTypes6,
                    new Object[] {
                        ClpSerializer.translateInput(dynamicQuery),
                        
                    start,
                        
                    end
                    });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName7,
                    _methodParameterTypes7,
                    new Object[] {
                        ClpSerializer.translateInput(dynamicQuery),
                        
                    start,
                        
                    end,
                        
                    ClpSerializer.translateInput(orderByComparator)
                    });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName8,
                    _methodParameterTypes8,
                    new Object[] { ClpSerializer.translateInput(dynamicQuery) });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return ((Long) returnObj).longValue();
    }

    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName9,
                    _methodParameterTypes9,
                    new Object[] {
                        ClpSerializer.translateInput(dynamicQuery),
                        
                    ClpSerializer.translateInput(projection)
                    });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return ((Long) returnObj).longValue();
    }

    @Override
    public es.eina.tfg.model.RouteLocation fetchRouteLocation(
        long routePositionId)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName10,
                    _methodParameterTypes10, new Object[] { routePositionId });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (es.eina.tfg.model.RouteLocation) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public es.eina.tfg.model.RouteLocation getRouteLocation(
        long routePositionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName11,
                    _methodParameterTypes11, new Object[] { routePositionId });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
                throw (com.liferay.portal.kernel.exception.PortalException) t;
            }

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (es.eina.tfg.model.RouteLocation) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName12,
                    _methodParameterTypes12,
                    new Object[] { ClpSerializer.translateInput(primaryKeyObj) });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
                throw (com.liferay.portal.kernel.exception.PortalException) t;
            }

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (com.liferay.portal.model.PersistedModel) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public java.util.List<es.eina.tfg.model.RouteLocation> getRouteLocations(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName13,
                    _methodParameterTypes13, new Object[] { start, end });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List<es.eina.tfg.model.RouteLocation>) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public int getRouteLocationsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName14,
                    _methodParameterTypes14, new Object[] {  });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return ((Integer) returnObj).intValue();
    }

    @Override
    public es.eina.tfg.model.RouteLocation updateRouteLocation(
        es.eina.tfg.model.RouteLocation routeLocation)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName15,
                    _methodParameterTypes15,
                    new Object[] { ClpSerializer.translateInput(routeLocation) });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (es.eina.tfg.model.RouteLocation) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public java.lang.String getBeanIdentifier() {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName16,
                    _methodParameterTypes16, new Object[] {  });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.lang.String) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        try {
            _invokableLocalService.invokeMethod(_methodName17,
                _methodParameterTypes17,
                new Object[] { ClpSerializer.translateInput(beanIdentifier) });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        throw new UnsupportedOperationException();
    }

    @Override
    public es.eina.tfg.model.RouteLocation add(java.lang.Long routeId,
        java.lang.Double latitude, java.lang.Double longitude)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NonExistingRouteException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName19,
                    _methodParameterTypes19,
                    new Object[] {
                        ClpSerializer.translateInput(routeId),
                        
                    ClpSerializer.translateInput(latitude),
                        
                    ClpSerializer.translateInput(longitude)
                    });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof es.eina.tfg.NonExistingRouteException) {
                throw (es.eina.tfg.NonExistingRouteException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (es.eina.tfg.model.RouteLocation) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public es.eina.tfg.model.RouteLocation update(
        java.lang.Long routeLocationId, java.lang.Long routeId,
        java.lang.Double latitude, java.lang.Double longitude)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NonExistingRouteException,
            es.eina.tfg.NonExistingRouteLocationException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName20,
                    _methodParameterTypes20,
                    new Object[] {
                        ClpSerializer.translateInput(routeLocationId),
                        
                    ClpSerializer.translateInput(routeId),
                        
                    ClpSerializer.translateInput(latitude),
                        
                    ClpSerializer.translateInput(longitude)
                    });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof es.eina.tfg.NonExistingRouteException) {
                throw (es.eina.tfg.NonExistingRouteException) t;
            }

            if (t instanceof es.eina.tfg.NonExistingRouteLocationException) {
                throw (es.eina.tfg.NonExistingRouteLocationException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (es.eina.tfg.model.RouteLocation) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public java.util.List<es.eina.tfg.model.RouteLocation> findByRouteId(
        java.lang.Long routeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName21,
                    _methodParameterTypes21,
                    new Object[] { ClpSerializer.translateInput(routeId) });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List<es.eina.tfg.model.RouteLocation>) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public java.util.List<es.eina.tfg.model.RouteLocation> findByRouteId(
        long routeId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName22,
                    _methodParameterTypes22,
                    new Object[] { routeId, start, end });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List<es.eina.tfg.model.RouteLocation>) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public int findByRouteIdCount(java.lang.Long routeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName23,
                    _methodParameterTypes23,
                    new Object[] { ClpSerializer.translateInput(routeId) });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return ((Integer) returnObj).intValue();
    }
}
