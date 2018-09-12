// This file was generated by the WebGME Federates Exporter plugin. Do not edit manually!

package supervisoryController;

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
* Implements ObjectRoot.Transaction
*/
public class Transaction extends ObjectRoot {

    private static final Logger logger = LogManager.getLogger();

    /**
    * Creates an instance of the Transaction object class with default attribute values.
    */
    public Transaction() {}

    private static int _accept_handle;
    private static int _tenderId_handle;

    private static boolean _isInitialized = false;

    private static int _handle;

    /**
    * Returns the handle (RTI assigned) of the Transaction object class.
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
    * Returns the fully-qualified (dot-delimited) name of the Transaction object class.
    * Note: As this is a static method, it is NOT polymorphic, and so, if called on
    * a reference will return the name of the class pertaining to the reference,
    * rather than the name of the class for the instance referred to by the reference.
    * For the polymorphic version of this method, use {@link #getClassName()}.
    *
    * @return the fully-qualified HLA class path for this object class
    */
    public static String get_class_name() {
        return "ObjectRoot.Transaction";
    }

    /**
    * Returns the simple name (the last name in the dot-delimited fully-qualified
    * class name) of the Transaction object class.
    *
    * @return the name of this object class
    */
    public static String get_simple_class_name() {
        return "Transaction";
    }

    private static Set< String > _datamemberNames = new HashSet< String >();
    private static Set< String > _allDatamemberNames = new HashSet< String >();

    /**
    * Returns a set containing the names of all of the non-hidden attributes in the
    * Transaction object class.
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
    * Transaction object class.
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
        _classNameSet.add("ObjectRoot.Transaction");
        _classNameClassMap.put("ObjectRoot.Transaction", Transaction.class);

        _datamemberClassNameSetMap.put("ObjectRoot.Transaction", _datamemberNames);
        _allDatamemberClassNameSetMap.put("ObjectRoot.Transaction", _allDatamemberNames);

        _datamemberNames.add("accept");
        _datamemberNames.add("tenderId");

        _datamemberTypeMap.put("accept", "boolean");
        _datamemberTypeMap.put("tenderId", "int");

        _allDatamemberNames.add("accept");
        _allDatamemberNames.add("tenderId");

        _classNamePublishAttributeNameMap.put("ObjectRoot.Transaction", _publishAttributeNameSet);
        _classNameSubscribeAttributeNameMap.put("ObjectRoot.Transaction", _subscribeAttributeNameSet);
    }

    protected static void init(RTIambassador rti) {
        if (_isInitialized) return;
        _isInitialized = true;

        ObjectRoot.init(rti);

        boolean isNotInitialized = true;
        while(isNotInitialized) {
            try {
                _handle = rti.getObjectClassHandle("ObjectRoot.Transaction");
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

        _classNameHandleMap.put("ObjectRoot.Transaction", get_handle());
        _classHandleNameMap.put(get_handle(), "ObjectRoot.Transaction");
        _classHandleSimpleNameMap.put(get_handle(), "Transaction");

        isNotInitialized = true;
        while(isNotInitialized) {
            try {
                _accept_handle = rti.getAttributeHandle("accept", get_handle());
                _tenderId_handle = rti.getAttributeHandle("tenderId", get_handle());
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

        _datamemberNameHandleMap.put("ObjectRoot.Transaction.accept", _accept_handle);
        _datamemberNameHandleMap.put("ObjectRoot.Transaction.tenderId", _tenderId_handle);

        _datamemberHandleNameMap.put(_accept_handle, "accept");
        _datamemberHandleNameMap.put(_tenderId_handle, "tenderId");
    }

    private static boolean _isPublished = false;

    /**
    * Publishes the Transaction object class for a federate.
    *
    * @param rti handle to the Local RTI Component
    */
    public static void publish(RTIambassador rti) {
        if (_isPublished) return;

        init(rti);

        AttributeHandleSet publishedAttributeHandleSet = _factory.createAttributeHandleSet();
        for(String attributeName : _publishAttributeNameSet) {
            try {
                publishedAttributeHandleSet.add(_datamemberNameHandleMap.get("ObjectRoot.Transaction." + attributeName));
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
    * Unpublishes the Transaction object class for a federate.
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
    * Subscribes a federate to the Transaction object class.
    *
    * @param rti handle to the Local RTI Component
    */
    public static void subscribe(RTIambassador rti) {
        if (_isSubscribed) return;

        init(rti);

        AttributeHandleSet subscribedAttributeHandleSet = _factory.createAttributeHandleSet();
        for(String attributeName : _subscribeAttributeNameSet) {
            try {
                subscribedAttributeHandleSet.add(_datamemberNameHandleMap.get("ObjectRoot.Transaction." + attributeName));
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
    * Unsubscribes a federate from the Transaction object class.
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
    * (that is, the Transaction object class).
    *
    * @param handle handle to compare to the value of the handle (RTI assigned) of
    * this class (the Transaction object class).
    * @return "true" if "handle" matches the value of the handle of this class
    * (that is, the Transaction object class).
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
        if (datamemberHandle == _accept_handle) return "accept";
        else if (datamemberHandle == _tenderId_handle) return "tenderId";
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
                + "accept:" + get_accept()
                + "," + "tenderId:" + get_tenderId()
                + ")";
    }


    /**
    * Publishes the "accept" attribute of the attribute's containing object
    * class for a federate.
    * Note:  This method only marks the "accept" attribute for publication.
    * To actually publish the attribute, the federate must (re)publish its containing
    * object class.
    * (using &lt;objectClassName&gt;.publish( RTIambassador rti ) ).
    */
    public static void publish_accept() {
        _publishAttributeNameSet.add( "accept" );
    }

    /**
    * Unpublishes the "accept" attribute of the attribute's containing object
    * class for a federate.
    * Note:  This method only marks the "accept" attribute for unpublication.
    * To actually publish the attribute, the federate must (re)publish its containing
    * object class.
    * (using &lt;objectClassName&gt;.publish( RTIambassador rti ) ).
    */
    public static void unpublish_accept() {
        _publishAttributeNameSet.remove( "accept" );
    }

    /**
    * Subscribes a federate to the "accept" attribute of the attribute's
    * containing object class.
    * Note:  This method only marks the "accept" attribute for subscription.
    * To actually subscribe to the attribute, the federate must (re)subscribe to its
    * containing object class.
    * (using &lt;objectClassName&gt;.subscribe( RTIambassador rti ) ).
    */
    public static void subscribe_accept() {
        _subscribeAttributeNameSet.add( "accept" );
    }

    /**
    * Unsubscribes a federate from the "accept" attribute of the attribute's
    * containing object class.
    * Note:  This method only marks the "accept" attribute for unsubscription.
    * To actually unsubscribe to the attribute, the federate must (re)subscribe to its
    * containing object class.
    * (using &lt;objectClassName&gt;.subscribe( RTIambassador rti ) ).
    */
    public static void unsubscribe_accept() {
        _subscribeAttributeNameSet.remove( "accept" );
    }

    /**
    * Publishes the "tenderId" attribute of the attribute's containing object
    * class for a federate.
    * Note:  This method only marks the "tenderId" attribute for publication.
    * To actually publish the attribute, the federate must (re)publish its containing
    * object class.
    * (using &lt;objectClassName&gt;.publish( RTIambassador rti ) ).
    */
    public static void publish_tenderId() {
        _publishAttributeNameSet.add( "tenderId" );
    }

    /**
    * Unpublishes the "tenderId" attribute of the attribute's containing object
    * class for a federate.
    * Note:  This method only marks the "tenderId" attribute for unpublication.
    * To actually publish the attribute, the federate must (re)publish its containing
    * object class.
    * (using &lt;objectClassName&gt;.publish( RTIambassador rti ) ).
    */
    public static void unpublish_tenderId() {
        _publishAttributeNameSet.remove( "tenderId" );
    }

    /**
    * Subscribes a federate to the "tenderId" attribute of the attribute's
    * containing object class.
    * Note:  This method only marks the "tenderId" attribute for subscription.
    * To actually subscribe to the attribute, the federate must (re)subscribe to its
    * containing object class.
    * (using &lt;objectClassName&gt;.subscribe( RTIambassador rti ) ).
    */
    public static void subscribe_tenderId() {
        _subscribeAttributeNameSet.add( "tenderId" );
    }

    /**
    * Unsubscribes a federate from the "tenderId" attribute of the attribute's
    * containing object class.
    * Note:  This method only marks the "tenderId" attribute for unsubscription.
    * To actually unsubscribe to the attribute, the federate must (re)subscribe to its
    * containing object class.
    * (using &lt;objectClassName&gt;.subscribe( RTIambassador rti ) ).
    */
    public static void unsubscribe_tenderId() {
        _subscribeAttributeNameSet.remove( "tenderId" );
    }

    protected Attribute< Boolean > _accept =
            new Attribute< Boolean >(  new Boolean( false )  );

    /**
    * Set the value of the "accept" attribute to "value" for this object.
    *
    * @param value the new value for the "accept" attribute
    */
    public void set_accept( boolean value ) {
        _accept.setValue( value );
        _accept.setTime( getTime() );
    }

    /**
    * Returns the value of the "accept" attribute of this object.
    *
    * @return the value of the "accept" attribute
    */
    public boolean get_accept() {
        return _accept.getValue();
    }

    /**
    * Returns the current timestamp of the "accept" attribute of this object.
    *
    * @return the current timestamp of the "accept" attribute
    */
    public double get_accept_time() {
        return _accept.getTime();
    }

    protected Attribute< Integer > _tenderId =
            new Attribute< Integer >(  new Integer( 0 )  );

    /**
    * Set the value of the "tenderId" attribute to "value" for this object.
    *
    * @param value the new value for the "tenderId" attribute
    */
    public void set_tenderId( int value ) {
        _tenderId.setValue( value );
        _tenderId.setTime( getTime() );
    }

    /**
    * Returns the value of the "tenderId" attribute of this object.
    *
    * @return the value of the "tenderId" attribute
    */
    public int get_tenderId() {
        return _tenderId.getValue();
    }

    /**
    * Returns the current timestamp of the "tenderId" attribute of this object.
    *
    * @return the current timestamp of the "tenderId" attribute
    */
    public double get_tenderId_time() {
        return _tenderId.getTime();
    }

    protected Transaction( ReflectedAttributes datamemberMap, boolean initFlag ) {
        super( datamemberMap, false );
        if ( initFlag ) setAttributes( datamemberMap );
    }

    protected Transaction( ReflectedAttributes datamemberMap, LogicalTime logicalTime, boolean initFlag ) {
        super( datamemberMap, logicalTime, false );
        if ( initFlag ) setAttributes( datamemberMap );
    }

    /**
    * Creates an instance of the Transaction object class, using
    * "datamemberMap" to initialize its attribute values.
    * "datamemberMap" is usually acquired as an argument to an RTI federate
    * callback method, such as "receiveInteraction".
    *
    * @param datamemberMap data structure containing initial values for the
    * attributes of this new Transaction object class instance
    */
    public Transaction( ReflectedAttributes datamemberMap ) {
        this( datamemberMap, true );
    }

    /**
    * Like {@link #Transaction( ReflectedAttributes datamemberMap )}, except this
    * new Transaction object class instance is given a timestamp of
    * "logicalTime".
    *
    * @param datamemberMap data structure containing initial values for the
    * attributes of this new Transaction object class instance
    * @param logicalTime timestamp for this new Transaction object class
    * instance
    */
    public Transaction( ReflectedAttributes datamemberMap, LogicalTime logicalTime ) {
        this( datamemberMap, logicalTime, true );
    }

    /**
    * Creates a new Transaction object class instance that is a duplicate
    * of the instance referred to by Transaction_var.
    *
    * @param Transaction_var Transaction object class instance of which
    * this newly created Transaction object class instance will be a
    * duplicate
    */
    public Transaction( Transaction Transaction_var ) {
        super( Transaction_var );

        set_accept( Transaction_var.get_accept() );
        set_tenderId( Transaction_var.get_tenderId() );
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
        if ( "accept".equals(datamemberName) ) return new Boolean(get_accept());
        else if ( "tenderId".equals(datamemberName) ) return new Integer(get_tenderId());
        else return super.getAttribute( datamemberName );
    }

    protected boolean setAttributeAux( String datamemberName, String val ) {
        boolean retval = true;
        if ( "accept".equals( datamemberName) ) set_accept( Boolean.parseBoolean(val) );
        else if ( "tenderId".equals( datamemberName) ) set_tenderId( Integer.parseInt(val) );
        else retval = super.setAttributeAux( datamemberName, val );

        return retval;
    }

    protected boolean setAttributeAux( String datamemberName, Object val ) {
        boolean retval = true;
        if ( "accept".equals( datamemberName) ) set_accept( (Boolean)val );
        else if ( "tenderId".equals( datamemberName) ) set_tenderId( (Integer)val );
        else retval = super.setAttributeAux( datamemberName, val );

        return retval;
    }

    @Override
    protected SuppliedAttributes createSuppliedDatamembers(boolean force) {
        SuppliedAttributes datamembers = _factory.createSuppliedAttributes();
 
        if (_publishAttributeNameSet.contains("accept") && _accept.shouldBeUpdated(force)) {
            datamembers.add( getAttributeHandle("accept"), getAttribute("accept").toString().getBytes() );
            _accept.setHasBeenUpdated();
        }

        if (_publishAttributeNameSet.contains("tenderId") && _tenderId.shouldBeUpdated(force)) {
            datamembers.add( getAttributeHandle("tenderId"), getAttribute("tenderId").toString().getBytes() );
            _tenderId.setHasBeenUpdated();
        }

        return datamembers;
    }

    public void copyFrom( Object object ) {
        super.copyFrom( object );
        if ( object instanceof Transaction ) {
            Transaction data = (Transaction)object;
            _accept = data._accept;
            _tenderId = data._tenderId;
        }
    }
}

