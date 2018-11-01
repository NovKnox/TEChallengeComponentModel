// This file was generated by the WebGME Federates Exporter plugin. Do not edit manually!

package TEChallenge;

import java.util.HashSet;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cpswt.utils.CpswtUtils;

import hla.rti.AttributeHandleSet;
import hla.rti.FederateNotExecutionMember;
import hla.rti.LogicalTime;
import hla.rti.NameNotFound;
import hla.rti.ObjectClassNotDefined;
import hla.rti.ObjectClassNotPublished;
import hla.rti.ObjectClassNotSubscribed;
import hla.rti.RTIambassador;
import hla.rti.ReflectedAttributes;
import hla.rti.SuppliedAttributes;

import org.cpswt.hla.*;

/**
* Implements ObjectRoot.supervisoryControlSignal
*/
public class supervisoryControlSignal extends ObjectRoot {

    private static final Logger logger = LogManager.getLogger();

    /**
    * Creates an instance of the supervisoryControlSignal object class with default attribute values.
    */
    public supervisoryControlSignal() {}

    private static int _localControllerName_handle;
    private static int _modulationSignal_handle;

    private static boolean _isInitialized = false;

    private static int _handle;

    /**
    * Returns the handle (RTI assigned) of the supervisoryControlSignal object class.
    * Note: As this is a static method, it is NOT polymorphic, and so, if called on
    * a reference will return the handle of the class pertaining to the reference,
    * rather than the handle of the class for the instance referred to by the reference.
    * For the polymorphic version of this method, use {@link #getClassHandle()}.
    *
    * @return the RTI assigned integer handle that represents this object class
    */
    public static int get_handle() {
        return _handle;
    }

    /**
    * Returns the fully-qualified (dot-delimited) name of the supervisoryControlSignal object class.
    * Note: As this is a static method, it is NOT polymorphic, and so, if called on
    * a reference will return the name of the class pertaining to the reference,
    * rather than the name of the class for the instance referred to by the reference.
    * For the polymorphic version of this method, use {@link #getClassName()}.
    *
    * @return the fully-qualified HLA class path for this object class
    */
    public static String get_class_name() {
        return "ObjectRoot.supervisoryControlSignal";
    }

    /**
    * Returns the simple name (the last name in the dot-delimited fully-qualified
    * class name) of the supervisoryControlSignal object class.
    *
    * @return the name of this object class
    */
    public static String get_simple_class_name() {
        return "supervisoryControlSignal";
    }

    private static Set< String > _datamemberNames = new HashSet< String >();
    private static Set< String > _allDatamemberNames = new HashSet< String >();

    /**
    * Returns a set containing the names of all of the non-hidden attributes in the
    * supervisoryControlSignal object class.
    * Note: As this is a static method, it is NOT polymorphic, and so, if called on
    * a reference will return a set of parameter names pertaining to the reference,
    * rather than the parameter names of the class for the instance referred to by
    * the reference.  For the polymorphic version of this method, use
    * {@link #getAttributeNames()}.
    *
    * @return a modifiable set of the non-hidden attribute names for this object class
    */
    public static Set< String > get_attribute_names() {
        return new HashSet< String >(_datamemberNames);
    }

    /**
    * Returns a set containing the names of all of the attributes in the
    * supervisoryControlSignal object class.
    * Note: As this is a static method, it is NOT polymorphic, and so, if called on
    * a reference will return a set of parameter names pertaining to the reference,
    * rather than the parameter names of the class for the instance referred to by
    * the reference.  For the polymorphic version of this method, use
    * {@link #getAttributeNames()}.
    *
    * @return a modifiable set of the attribute names for this object class
    */
    public static Set< String > get_all_attribute_names() {
        return new HashSet< String >(_allDatamemberNames);
    }

    private static Set< String > _publishAttributeNameSet = new HashSet< String >();
    private static Set< String > _subscribeAttributeNameSet = new HashSet< String >();

    static {
        _classNameSet.add("ObjectRoot.supervisoryControlSignal");
        _classNameClassMap.put("ObjectRoot.supervisoryControlSignal", supervisoryControlSignal.class);

        _datamemberClassNameSetMap.put("ObjectRoot.supervisoryControlSignal", _datamemberNames);
        _allDatamemberClassNameSetMap.put("ObjectRoot.supervisoryControlSignal", _allDatamemberNames);

        _datamemberNames.add("localControllerName");
        _datamemberNames.add("modulationSignal");

        _datamemberTypeMap.put("localControllerName", "String");
        _datamemberTypeMap.put("modulationSignal", "float");

        _allDatamemberNames.add("localControllerName");
        _allDatamemberNames.add("modulationSignal");

        _classNamePublishAttributeNameMap.put("ObjectRoot.supervisoryControlSignal", _publishAttributeNameSet);
        _classNameSubscribeAttributeNameMap.put("ObjectRoot.supervisoryControlSignal", _subscribeAttributeNameSet);
    }

    protected static void init(RTIambassador rti) {
        if (_isInitialized) return;
        _isInitialized = true;

        ObjectRoot.init(rti);

        boolean isNotInitialized = true;
        while(isNotInitialized) {
            try {
                _handle = rti.getObjectClassHandle("ObjectRoot.supervisoryControlSignal");
                isNotInitialized = false;
            } catch (FederateNotExecutionMember e) {
                logger.error("could not initialize: Federate Not Execution Member", e);
                return;
            } catch (NameNotFound e) {
                logger.error("could not initialize: Name Not Found", e);
                return;
            } catch (Exception e) {
                logger.error(e);
                CpswtUtils.sleepDefault();
            }
        }

        _classNameHandleMap.put("ObjectRoot.supervisoryControlSignal", get_handle());
        _classHandleNameMap.put(get_handle(), "ObjectRoot.supervisoryControlSignal");
        _classHandleSimpleNameMap.put(get_handle(), "supervisoryControlSignal");

        isNotInitialized = true;
        while(isNotInitialized) {
            try {
                _localControllerName_handle = rti.getAttributeHandle("localControllerName", get_handle());
                _modulationSignal_handle = rti.getAttributeHandle("modulationSignal", get_handle());
                isNotInitialized = false;
            } catch (FederateNotExecutionMember e) {
                logger.error("could not initialize: Federate Not Execution Member", e);
                return;
            } catch (ObjectClassNotDefined e) {
                logger.error("could not initialize: Object Class Not Defined", e);
                return;
            } catch (NameNotFound e) {
                logger.error("could not initialize: Name Not Found", e);
                return;
            } catch (Exception e) {
                logger.error(e);
                CpswtUtils.sleepDefault();
            }
        }

        _datamemberNameHandleMap.put("ObjectRoot.supervisoryControlSignal.localControllerName", _localControllerName_handle);
        _datamemberNameHandleMap.put("ObjectRoot.supervisoryControlSignal.modulationSignal", _modulationSignal_handle);

        _datamemberHandleNameMap.put(_localControllerName_handle, "localControllerName");
        _datamemberHandleNameMap.put(_modulationSignal_handle, "modulationSignal");
    }

    private static boolean _isPublished = false;

    /**
    * Publishes the supervisoryControlSignal object class for a federate.
    *
    * @param rti handle to the Local RTI Component
    */
    public static void publish(RTIambassador rti) {
        if (_isPublished) return;

        init(rti);

        AttributeHandleSet publishedAttributeHandleSet = _factory.createAttributeHandleSet();
        for(String attributeName : _publishAttributeNameSet) {
            try {
                publishedAttributeHandleSet.add(_datamemberNameHandleMap.get("ObjectRoot.supervisoryControlSignal." + attributeName));
                logger.trace("publish {}:{}", get_class_name(), attributeName);
            } catch (Exception e) {
                logger.error("could not publish \"" + attributeName + "\" attribute.", e);
            }
        }

        synchronized(rti) {
            boolean isNotPublished = true;
            while(isNotPublished) {
                try {
                    rti.publishObjectClass(get_handle(), publishedAttributeHandleSet);
                    isNotPublished = false;
                } catch (FederateNotExecutionMember e) {
                    logger.error("could not publish: Federate Not Execution Member", e);
                    return;
                } catch (ObjectClassNotDefined e) {
                    logger.error("could not publish: Object Class Not Defined", e);
                    return;
                } catch (Exception e) {
                    logger.error(e);
                    CpswtUtils.sleepDefault();
                }
            }
        }

        _isPublished = true;
        logger.debug("publish: {}", get_class_name());
    }

    /**
    * Unpublishes the supervisoryControlSignal object class for a federate.
    *
    * @param rti handle to the Local RTI Component
    */
    public static void unpublish(RTIambassador rti) {
        if (!_isPublished) return;

        init(rti);

        synchronized(rti) {
            boolean isNotUnpublished = true;
            while(isNotUnpublished) {
                try {
                    rti.unpublishObjectClass(get_handle());
                    isNotUnpublished = false;
                } catch (FederateNotExecutionMember e) {
                    logger.error("could not unpublish: Federate Not Execution Member", e);
                    return;
                } catch (ObjectClassNotDefined e) {
                    logger.error("could not unpublish: Object Class Not Defined", e);
                    return;
                } catch (ObjectClassNotPublished e) {
                    logger.error("could not unpublish: Object Class Not Published", e);
                    return;
                } catch (Exception e) {
                    logger.error(e);
                    CpswtUtils.sleepDefault();
                }
            }
        }

        _isPublished = false;
        logger.debug("unpublish: {}", get_class_name());
    }

    private static boolean _isSubscribed = false;

    /**
    * Subscribes a federate to the supervisoryControlSignal object class.
    *
    * @param rti handle to the Local RTI Component
    */
    public static void subscribe(RTIambassador rti) {
        if (_isSubscribed) return;

        init(rti);

        AttributeHandleSet subscribedAttributeHandleSet = _factory.createAttributeHandleSet();
        for(String attributeName : _subscribeAttributeNameSet) {
            try {
                subscribedAttributeHandleSet.add(_datamemberNameHandleMap.get("ObjectRoot.supervisoryControlSignal." + attributeName));
                logger.trace("subscribe {}:{}", get_class_name(), attributeName);
            } catch (Exception e) {
                logger.error("could not subscribe to \"" + attributeName + "\" attribute.", e);
            }
        }

        synchronized(rti) {
            boolean isNotSubscribed = true;
            while(isNotSubscribed) {
                try {
                    rti.subscribeObjectClassAttributes(get_handle(), subscribedAttributeHandleSet);
                    isNotSubscribed = false;
                } catch (FederateNotExecutionMember e) {
                    logger.error("could not subscribe: Federate Not Execution Member", e);
                    return;
                } catch (ObjectClassNotDefined e) {
                    logger.error("could not subscribe: Object Class Not Defined", e);
                    return;
                } catch (Exception e) {
                    logger.error(e);
                    CpswtUtils.sleepDefault();
                }
            }
        }

        _isSubscribed = true;
        logger.debug("subscribe: {}", get_class_name());
    }

    /**
    * Unsubscribes a federate from the supervisoryControlSignal object class.
    *
    * @param rti handle to the Local RTI Component
    */
    public static void unsubscribe(RTIambassador rti) {
        if (!_isSubscribed) return;

        init(rti);

        synchronized(rti) {
            boolean isNotUnsubscribed = true;
            while(isNotUnsubscribed) {
                try {
                    rti.unsubscribeObjectClass(get_handle());
                    isNotUnsubscribed = false;
                } catch (FederateNotExecutionMember e) {
                    logger.error("could not unsubscribe: Federate Not Execution Member", e);
                    return;
                } catch (ObjectClassNotDefined e) {
                    logger.error("could not unsubscribe: Object Class Not Defined", e);
                    return;
                } catch (ObjectClassNotSubscribed e) {
                    logger.error("could not unsubscribe: Object Class Not Subscribed", e);
                    return;
                } catch (Exception e) {
                    logger.error(e);
                    CpswtUtils.sleepDefault();
                }
            }
        }

        _isSubscribed = false;
        logger.debug("unsubscribe: {}", get_class_name());
    }

    /**
    * Return true if "handle" is equal to the handle (RTI assigned) of this class
    * (that is, the supervisoryControlSignal object class).
    *
    * @param handle handle to compare to the value of the handle (RTI assigned) of
    * this class (the supervisoryControlSignal object class).
    * @return "true" if "handle" matches the value of the handle of this class
    * (that is, the supervisoryControlSignal object class).
    */
    public static boolean match(int handle) {
        return handle == get_handle();
    }

    /**
    * Returns the handle (RTI assigned) of this instance's object class .
    *
    * @return the handle (RTI assigned) if this instance's object class
    */
    public int getClassHandle() {
        return get_handle();
    }

    /**
    * Returns the fully-qualified (dot-delimited) name of this instance's object class.
    *
    * @return the fully-qualified (dot-delimited) name of this instance's object class
    */
    public String getClassName() {
        return get_class_name();
    }

    /**
    * Returns the simple name (last name in its fully-qualified dot-delimited name)
    * of this instance's object class.
    *
    * @return the simple name of this instance's object class
    */
    public String getSimpleClassName() {
        return get_simple_class_name();
    }

    /**
    * Returns a set containing the names of all of the non-hiddenattributes of an
    * object class instance.
    *
    * @return set containing the names of all of the attributes of an
    * object class instance
    */
    public Set< String > getAttributeNames() {
        return get_attribute_names();
    }

    /**
    * Returns a set containing the names of all of the attributes of an
    * object class instance.
    *
    * @return set containing the names of all of the attributes of an
    * object class instance
    */
    public Set< String > getAllAttributeNames() {
        return get_all_attribute_names();
    }

    @Override
    public String getAttributeName(int datamemberHandle) {
        if (datamemberHandle == _localControllerName_handle) return "localControllerName";
        else if (datamemberHandle == _modulationSignal_handle) return "modulationSignal";
        else return super.getAttributeName(datamemberHandle);
    }

    /**
    * Publishes the object class of this instance of the class for a federate.
    *
    * @param rti handle to the Local RTI Component
    */
    public void publishObject(RTIambassador rti) {
        publish(rti);
    }

    /**
    * Unpublishes the object class of this instance of this class for a federate.
    *
    * @param rti handle to the Local RTI Component
    */
    public void unpublishObject(RTIambassador rti) {
        unpublish(rti);
    }

    /**
    * Subscribes a federate to the object class of this instance of this class.
    *
    * @param rti handle to the Local RTI Component
    */
    public void subscribeObject(RTIambassador rti) {
        subscribe(rti);
    }

    /**
    * Unsubscribes a federate from the object class of this instance of this class.
    *
    * @param rti handle to the Local RTI Component
    */
    public void unsubscribeObject(RTIambassador rti) {
        unsubscribe(rti);
    }

    @Override
    public String toString() {
        return getClass().getName() + "("
                + "localControllerName:" + get_localControllerName()
                + "," + "modulationSignal:" + get_modulationSignal()
                + ")";
    }


    /**
    * Publishes the "localControllerName" attribute of the attribute's containing object
    * class for a federate.
    * Note:  This method only marks the "localControllerName" attribute for publication.
    * To actually publish the attribute, the federate must (re)publish its containing
    * object class.
    * (using &lt;objectClassName&gt;.publish( RTIambassador rti ) ).
    */
    public static void publish_localControllerName() {
        _publishAttributeNameSet.add( "localControllerName" );
    }

    /**
    * Unpublishes the "localControllerName" attribute of the attribute's containing object
    * class for a federate.
    * Note:  This method only marks the "localControllerName" attribute for unpublication.
    * To actually publish the attribute, the federate must (re)publish its containing
    * object class.
    * (using &lt;objectClassName&gt;.publish( RTIambassador rti ) ).
    */
    public static void unpublish_localControllerName() {
        _publishAttributeNameSet.remove( "localControllerName" );
    }

    /**
    * Subscribes a federate to the "localControllerName" attribute of the attribute's
    * containing object class.
    * Note:  This method only marks the "localControllerName" attribute for subscription.
    * To actually subscribe to the attribute, the federate must (re)subscribe to its
    * containing object class.
    * (using &lt;objectClassName&gt;.subscribe( RTIambassador rti ) ).
    */
    public static void subscribe_localControllerName() {
        _subscribeAttributeNameSet.add( "localControllerName" );
    }

    /**
    * Unsubscribes a federate from the "localControllerName" attribute of the attribute's
    * containing object class.
    * Note:  This method only marks the "localControllerName" attribute for unsubscription.
    * To actually unsubscribe to the attribute, the federate must (re)subscribe to its
    * containing object class.
    * (using &lt;objectClassName&gt;.subscribe( RTIambassador rti ) ).
    */
    public static void unsubscribe_localControllerName() {
        _subscribeAttributeNameSet.remove( "localControllerName" );
    }

    /**
    * Publishes the "modulationSignal" attribute of the attribute's containing object
    * class for a federate.
    * Note:  This method only marks the "modulationSignal" attribute for publication.
    * To actually publish the attribute, the federate must (re)publish its containing
    * object class.
    * (using &lt;objectClassName&gt;.publish( RTIambassador rti ) ).
    */
    public static void publish_modulationSignal() {
        _publishAttributeNameSet.add( "modulationSignal" );
    }

    /**
    * Unpublishes the "modulationSignal" attribute of the attribute's containing object
    * class for a federate.
    * Note:  This method only marks the "modulationSignal" attribute for unpublication.
    * To actually publish the attribute, the federate must (re)publish its containing
    * object class.
    * (using &lt;objectClassName&gt;.publish( RTIambassador rti ) ).
    */
    public static void unpublish_modulationSignal() {
        _publishAttributeNameSet.remove( "modulationSignal" );
    }

    /**
    * Subscribes a federate to the "modulationSignal" attribute of the attribute's
    * containing object class.
    * Note:  This method only marks the "modulationSignal" attribute for subscription.
    * To actually subscribe to the attribute, the federate must (re)subscribe to its
    * containing object class.
    * (using &lt;objectClassName&gt;.subscribe( RTIambassador rti ) ).
    */
    public static void subscribe_modulationSignal() {
        _subscribeAttributeNameSet.add( "modulationSignal" );
    }

    /**
    * Unsubscribes a federate from the "modulationSignal" attribute of the attribute's
    * containing object class.
    * Note:  This method only marks the "modulationSignal" attribute for unsubscription.
    * To actually unsubscribe to the attribute, the federate must (re)subscribe to its
    * containing object class.
    * (using &lt;objectClassName&gt;.subscribe( RTIambassador rti ) ).
    */
    public static void unsubscribe_modulationSignal() {
        _subscribeAttributeNameSet.remove( "modulationSignal" );
    }

    protected Attribute< String > _localControllerName =
            new Attribute< String >(  new String( "" )  );

    /**
    * Set the value of the "localControllerName" attribute to "value" for this object.
    *
    * @param value the new value for the "localControllerName" attribute
    */
    public void set_localControllerName( String value ) {
        _localControllerName.setValue( value );
        _localControllerName.setTime( getTime() );
    }

    /**
    * Returns the value of the "localControllerName" attribute of this object.
    *
    * @return the value of the "localControllerName" attribute
    */
    public String get_localControllerName() {
        return _localControllerName.getValue();
    }

    /**
    * Returns the current timestamp of the "localControllerName" attribute of this object.
    *
    * @return the current timestamp of the "localControllerName" attribute
    */
    public double get_localControllerName_time() {
        return _localControllerName.getTime();
    }

    protected Attribute< Float > _modulationSignal =
            new Attribute< Float >(  new Float( 0 )  );

    /**
    * Set the value of the "modulationSignal" attribute to "value" for this object.
    *
    * @param value the new value for the "modulationSignal" attribute
    */
    public void set_modulationSignal( float value ) {
        _modulationSignal.setValue( value );
        _modulationSignal.setTime( getTime() );
    }

    /**
    * Returns the value of the "modulationSignal" attribute of this object.
    *
    * @return the value of the "modulationSignal" attribute
    */
    public float get_modulationSignal() {
        return _modulationSignal.getValue();
    }

    /**
    * Returns the current timestamp of the "modulationSignal" attribute of this object.
    *
    * @return the current timestamp of the "modulationSignal" attribute
    */
    public double get_modulationSignal_time() {
        return _modulationSignal.getTime();
    }

    protected supervisoryControlSignal( ReflectedAttributes datamemberMap, boolean initFlag ) {
        super( datamemberMap, false );
        if ( initFlag ) setAttributes( datamemberMap );
    }

    protected supervisoryControlSignal( ReflectedAttributes datamemberMap, LogicalTime logicalTime, boolean initFlag ) {
        super( datamemberMap, logicalTime, false );
        if ( initFlag ) setAttributes( datamemberMap );
    }

    /**
    * Creates an instance of the supervisoryControlSignal object class, using
    * "datamemberMap" to initialize its attribute values.
    * "datamemberMap" is usually acquired as an argument to an RTI federate
    * callback method, such as "receiveInteraction".
    *
    * @param datamemberMap data structure containing initial values for the
    * attributes of this new supervisoryControlSignal object class instance
    */
    public supervisoryControlSignal( ReflectedAttributes datamemberMap ) {
        this( datamemberMap, true );
    }

    /**
    * Like {@link #supervisoryControlSignal( ReflectedAttributes datamemberMap )}, except this
    * new supervisoryControlSignal object class instance is given a timestamp of
    * "logicalTime".
    *
    * @param datamemberMap data structure containing initial values for the
    * attributes of this new supervisoryControlSignal object class instance
    * @param logicalTime timestamp for this new supervisoryControlSignal object class
    * instance
    */
    public supervisoryControlSignal( ReflectedAttributes datamemberMap, LogicalTime logicalTime ) {
        this( datamemberMap, logicalTime, true );
    }

    /**
    * Creates a new supervisoryControlSignal object class instance that is a duplicate
    * of the instance referred to by supervisoryControlSignal_var.
    *
    * @param supervisoryControlSignal_var supervisoryControlSignal object class instance of which
    * this newly created supervisoryControlSignal object class instance will be a
    * duplicate
    */
    public supervisoryControlSignal( supervisoryControlSignal supervisoryControlSignal_var ) {
        super( supervisoryControlSignal_var );

        set_localControllerName( supervisoryControlSignal_var.get_localControllerName() );
        set_modulationSignal( supervisoryControlSignal_var.get_modulationSignal() );
    }

    /**
    * Returns the value of the attribute whose name is "datamemberName"
    * for this object.
    *
    * @param datamemberName name of attribute whose value is to be
    * returned
    * @return value of the attribute whose name is "datamemberName"
    * for this object
    */
    public Object getAttribute( String datamemberName ) {
        if ( "localControllerName".equals(datamemberName) ) return get_localControllerName();
        else if ( "modulationSignal".equals(datamemberName) ) return new Float(get_modulationSignal());
        else return super.getAttribute( datamemberName );
    }

    protected boolean setAttributeAux( String datamemberName, String val ) {
        boolean retval = true;
        if ( "localControllerName".equals( datamemberName) ) set_localControllerName( val );
        else if ( "modulationSignal".equals( datamemberName) ) set_modulationSignal( Float.parseFloat(val) );
        else retval = super.setAttributeAux( datamemberName, val );

        return retval;
    }

    protected boolean setAttributeAux( String datamemberName, Object val ) {
        boolean retval = true;
        if ( "localControllerName".equals( datamemberName) ) set_localControllerName( (String)val );
        else if ( "modulationSignal".equals( datamemberName) ) set_modulationSignal( (Float)val );
        else retval = super.setAttributeAux( datamemberName, val );

        return retval;
    }

    @Override
    protected SuppliedAttributes createSuppliedDatamembers(boolean force) {
        SuppliedAttributes datamembers = _factory.createSuppliedAttributes();
 
        if (_publishAttributeNameSet.contains("localControllerName") && _localControllerName.shouldBeUpdated(force)) {
            datamembers.add( getAttributeHandle("localControllerName"), getAttribute("localControllerName").toString().getBytes() );
            _localControllerName.setHasBeenUpdated();
        }

        if (_publishAttributeNameSet.contains("modulationSignal") && _modulationSignal.shouldBeUpdated(force)) {
            datamembers.add( getAttributeHandle("modulationSignal"), getAttribute("modulationSignal").toString().getBytes() );
            _modulationSignal.setHasBeenUpdated();
        }

        return datamembers;
    }

    public void copyFrom( Object object ) {
        super.copyFrom( object );
        if ( object instanceof supervisoryControlSignal ) {
            supervisoryControlSignal data = (supervisoryControlSignal)object;
            _localControllerName = data._localControllerName;
            _modulationSignal = data._modulationSignal;
        }
    }
}
