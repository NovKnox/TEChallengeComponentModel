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
* Implements ObjectRoot.Tender
*/
public class Tender extends ObjectRoot {

    private static final Logger logger = LogManager.getLogger();

    /**
    * Creates an instance of the Tender object class with default attribute values.
    */
    public Tender() {}

    private static int _price_handle;
    private static int _quantity_handle;
    private static int _tenderId_handle;
    private static int _timeReference_handle;
    private static int _type_handle;

    private static boolean _isInitialized = false;

    private static int _handle;

    /**
    * Returns the handle (RTI assigned) of the Tender object class.
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
    * Returns the fully-qualified (dot-delimited) name of the Tender object class.
    * Note: As this is a static method, it is NOT polymorphic, and so, if called on
    * a reference will return the name of the class pertaining to the reference,
    * rather than the name of the class for the instance referred to by the reference.
    * For the polymorphic version of this method, use {@link #getClassName()}.
    *
    * @return the fully-qualified HLA class path for this object class
    */
    public static String get_class_name() {
        return "ObjectRoot.Tender";
    }

    /**
    * Returns the simple name (the last name in the dot-delimited fully-qualified
    * class name) of the Tender object class.
    *
    * @return the name of this object class
    */
    public static String get_simple_class_name() {
        return "Tender";
    }

    private static Set< String > _datamemberNames = new HashSet< String >();
    private static Set< String > _allDatamemberNames = new HashSet< String >();

    /**
    * Returns a set containing the names of all of the non-hidden attributes in the
    * Tender object class.
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
    * Tender object class.
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
        _classNameSet.add("ObjectRoot.Tender");
        _classNameClassMap.put("ObjectRoot.Tender", Tender.class);

        _datamemberClassNameSetMap.put("ObjectRoot.Tender", _datamemberNames);
        _allDatamemberClassNameSetMap.put("ObjectRoot.Tender", _allDatamemberNames);

        _datamemberNames.add("price");
        _datamemberNames.add("quantity");
        _datamemberNames.add("tenderId");
        _datamemberNames.add("timeReference");
        _datamemberNames.add("type");

        _datamemberTypeMap.put("price", "float");
        _datamemberTypeMap.put("quantity", "float");
        _datamemberTypeMap.put("tenderId", "int");
        _datamemberTypeMap.put("timeReference", "int");
        _datamemberTypeMap.put("type", "String");

        _allDatamemberNames.add("price");
        _allDatamemberNames.add("quantity");
        _allDatamemberNames.add("tenderId");
        _allDatamemberNames.add("timeReference");
        _allDatamemberNames.add("type");

        _classNamePublishAttributeNameMap.put("ObjectRoot.Tender", _publishAttributeNameSet);
        _classNameSubscribeAttributeNameMap.put("ObjectRoot.Tender", _subscribeAttributeNameSet);
    }

    protected static void init(RTIambassador rti) {
        if (_isInitialized) return;
        _isInitialized = true;

        ObjectRoot.init(rti);

        boolean isNotInitialized = true;
        while(isNotInitialized) {
            try {
                _handle = rti.getObjectClassHandle("ObjectRoot.Tender");
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

        _classNameHandleMap.put("ObjectRoot.Tender", get_handle());
        _classHandleNameMap.put(get_handle(), "ObjectRoot.Tender");
        _classHandleSimpleNameMap.put(get_handle(), "Tender");

        isNotInitialized = true;
        while(isNotInitialized) {
            try {
                _price_handle = rti.getAttributeHandle("price", get_handle());
                _quantity_handle = rti.getAttributeHandle("quantity", get_handle());
                _tenderId_handle = rti.getAttributeHandle("tenderId", get_handle());
                _timeReference_handle = rti.getAttributeHandle("timeReference", get_handle());
                _type_handle = rti.getAttributeHandle("type", get_handle());
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

        _datamemberNameHandleMap.put("ObjectRoot.Tender.price", _price_handle);
        _datamemberNameHandleMap.put("ObjectRoot.Tender.quantity", _quantity_handle);
        _datamemberNameHandleMap.put("ObjectRoot.Tender.tenderId", _tenderId_handle);
        _datamemberNameHandleMap.put("ObjectRoot.Tender.timeReference", _timeReference_handle);
        _datamemberNameHandleMap.put("ObjectRoot.Tender.type", _type_handle);

        _datamemberHandleNameMap.put(_price_handle, "price");
        _datamemberHandleNameMap.put(_quantity_handle, "quantity");
        _datamemberHandleNameMap.put(_tenderId_handle, "tenderId");
        _datamemberHandleNameMap.put(_timeReference_handle, "timeReference");
        _datamemberHandleNameMap.put(_type_handle, "type");
    }

    private static boolean _isPublished = false;

    /**
    * Publishes the Tender object class for a federate.
    *
    * @param rti handle to the Local RTI Component
    */
    public static void publish(RTIambassador rti) {
        if (_isPublished) return;

        init(rti);

        AttributeHandleSet publishedAttributeHandleSet = _factory.createAttributeHandleSet();
        for(String attributeName : _publishAttributeNameSet) {
            try {
                publishedAttributeHandleSet.add(_datamemberNameHandleMap.get("ObjectRoot.Tender." + attributeName));
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
    * Unpublishes the Tender object class for a federate.
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
    * Subscribes a federate to the Tender object class.
    *
    * @param rti handle to the Local RTI Component
    */
    public static void subscribe(RTIambassador rti) {
        if (_isSubscribed) return;

        init(rti);

        AttributeHandleSet subscribedAttributeHandleSet = _factory.createAttributeHandleSet();
        for(String attributeName : _subscribeAttributeNameSet) {
            try {
                subscribedAttributeHandleSet.add(_datamemberNameHandleMap.get("ObjectRoot.Tender." + attributeName));
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
    * Unsubscribes a federate from the Tender object class.
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
    * (that is, the Tender object class).
    *
    * @param handle handle to compare to the value of the handle (RTI assigned) of
    * this class (the Tender object class).
    * @return "true" if "handle" matches the value of the handle of this class
    * (that is, the Tender object class).
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
        if (datamemberHandle == _price_handle) return "price";
        else if (datamemberHandle == _quantity_handle) return "quantity";
        else if (datamemberHandle == _tenderId_handle) return "tenderId";
        else if (datamemberHandle == _timeReference_handle) return "timeReference";
        else if (datamemberHandle == _type_handle) return "type";
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
                + "price:" + get_price()
                + "," + "quantity:" + get_quantity()
                + "," + "tenderId:" + get_tenderId()
                + "," + "timeReference:" + get_timeReference()
                + "," + "type:" + get_type()
                + ")";
    }


    /**
    * Publishes the "price" attribute of the attribute's containing object
    * class for a federate.
    * Note:  This method only marks the "price" attribute for publication.
    * To actually publish the attribute, the federate must (re)publish its containing
    * object class.
    * (using &lt;objectClassName&gt;.publish( RTIambassador rti ) ).
    */
    public static void publish_price() {
        _publishAttributeNameSet.add( "price" );
    }

    /**
    * Unpublishes the "price" attribute of the attribute's containing object
    * class for a federate.
    * Note:  This method only marks the "price" attribute for unpublication.
    * To actually publish the attribute, the federate must (re)publish its containing
    * object class.
    * (using &lt;objectClassName&gt;.publish( RTIambassador rti ) ).
    */
    public static void unpublish_price() {
        _publishAttributeNameSet.remove( "price" );
    }

    /**
    * Subscribes a federate to the "price" attribute of the attribute's
    * containing object class.
    * Note:  This method only marks the "price" attribute for subscription.
    * To actually subscribe to the attribute, the federate must (re)subscribe to its
    * containing object class.
    * (using &lt;objectClassName&gt;.subscribe( RTIambassador rti ) ).
    */
    public static void subscribe_price() {
        _subscribeAttributeNameSet.add( "price" );
    }

    /**
    * Unsubscribes a federate from the "price" attribute of the attribute's
    * containing object class.
    * Note:  This method only marks the "price" attribute for unsubscription.
    * To actually unsubscribe to the attribute, the federate must (re)subscribe to its
    * containing object class.
    * (using &lt;objectClassName&gt;.subscribe( RTIambassador rti ) ).
    */
    public static void unsubscribe_price() {
        _subscribeAttributeNameSet.remove( "price" );
    }

    /**
    * Publishes the "quantity" attribute of the attribute's containing object
    * class for a federate.
    * Note:  This method only marks the "quantity" attribute for publication.
    * To actually publish the attribute, the federate must (re)publish its containing
    * object class.
    * (using &lt;objectClassName&gt;.publish( RTIambassador rti ) ).
    */
    public static void publish_quantity() {
        _publishAttributeNameSet.add( "quantity" );
    }

    /**
    * Unpublishes the "quantity" attribute of the attribute's containing object
    * class for a federate.
    * Note:  This method only marks the "quantity" attribute for unpublication.
    * To actually publish the attribute, the federate must (re)publish its containing
    * object class.
    * (using &lt;objectClassName&gt;.publish( RTIambassador rti ) ).
    */
    public static void unpublish_quantity() {
        _publishAttributeNameSet.remove( "quantity" );
    }

    /**
    * Subscribes a federate to the "quantity" attribute of the attribute's
    * containing object class.
    * Note:  This method only marks the "quantity" attribute for subscription.
    * To actually subscribe to the attribute, the federate must (re)subscribe to its
    * containing object class.
    * (using &lt;objectClassName&gt;.subscribe( RTIambassador rti ) ).
    */
    public static void subscribe_quantity() {
        _subscribeAttributeNameSet.add( "quantity" );
    }

    /**
    * Unsubscribes a federate from the "quantity" attribute of the attribute's
    * containing object class.
    * Note:  This method only marks the "quantity" attribute for unsubscription.
    * To actually unsubscribe to the attribute, the federate must (re)subscribe to its
    * containing object class.
    * (using &lt;objectClassName&gt;.subscribe( RTIambassador rti ) ).
    */
    public static void unsubscribe_quantity() {
        _subscribeAttributeNameSet.remove( "quantity" );
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

    /**
    * Publishes the "timeReference" attribute of the attribute's containing object
    * class for a federate.
    * Note:  This method only marks the "timeReference" attribute for publication.
    * To actually publish the attribute, the federate must (re)publish its containing
    * object class.
    * (using &lt;objectClassName&gt;.publish( RTIambassador rti ) ).
    */
    public static void publish_timeReference() {
        _publishAttributeNameSet.add( "timeReference" );
    }

    /**
    * Unpublishes the "timeReference" attribute of the attribute's containing object
    * class for a federate.
    * Note:  This method only marks the "timeReference" attribute for unpublication.
    * To actually publish the attribute, the federate must (re)publish its containing
    * object class.
    * (using &lt;objectClassName&gt;.publish( RTIambassador rti ) ).
    */
    public static void unpublish_timeReference() {
        _publishAttributeNameSet.remove( "timeReference" );
    }

    /**
    * Subscribes a federate to the "timeReference" attribute of the attribute's
    * containing object class.
    * Note:  This method only marks the "timeReference" attribute for subscription.
    * To actually subscribe to the attribute, the federate must (re)subscribe to its
    * containing object class.
    * (using &lt;objectClassName&gt;.subscribe( RTIambassador rti ) ).
    */
    public static void subscribe_timeReference() {
        _subscribeAttributeNameSet.add( "timeReference" );
    }

    /**
    * Unsubscribes a federate from the "timeReference" attribute of the attribute's
    * containing object class.
    * Note:  This method only marks the "timeReference" attribute for unsubscription.
    * To actually unsubscribe to the attribute, the federate must (re)subscribe to its
    * containing object class.
    * (using &lt;objectClassName&gt;.subscribe( RTIambassador rti ) ).
    */
    public static void unsubscribe_timeReference() {
        _subscribeAttributeNameSet.remove( "timeReference" );
    }

    /**
    * Publishes the "type" attribute of the attribute's containing object
    * class for a federate.
    * Note:  This method only marks the "type" attribute for publication.
    * To actually publish the attribute, the federate must (re)publish its containing
    * object class.
    * (using &lt;objectClassName&gt;.publish( RTIambassador rti ) ).
    */
    public static void publish_type() {
        _publishAttributeNameSet.add( "type" );
    }

    /**
    * Unpublishes the "type" attribute of the attribute's containing object
    * class for a federate.
    * Note:  This method only marks the "type" attribute for unpublication.
    * To actually publish the attribute, the federate must (re)publish its containing
    * object class.
    * (using &lt;objectClassName&gt;.publish( RTIambassador rti ) ).
    */
    public static void unpublish_type() {
        _publishAttributeNameSet.remove( "type" );
    }

    /**
    * Subscribes a federate to the "type" attribute of the attribute's
    * containing object class.
    * Note:  This method only marks the "type" attribute for subscription.
    * To actually subscribe to the attribute, the federate must (re)subscribe to its
    * containing object class.
    * (using &lt;objectClassName&gt;.subscribe( RTIambassador rti ) ).
    */
    public static void subscribe_type() {
        _subscribeAttributeNameSet.add( "type" );
    }

    /**
    * Unsubscribes a federate from the "type" attribute of the attribute's
    * containing object class.
    * Note:  This method only marks the "type" attribute for unsubscription.
    * To actually unsubscribe to the attribute, the federate must (re)subscribe to its
    * containing object class.
    * (using &lt;objectClassName&gt;.subscribe( RTIambassador rti ) ).
    */
    public static void unsubscribe_type() {
        _subscribeAttributeNameSet.remove( "type" );
    }

    protected Attribute< Float > _price =
            new Attribute< Float >(  new Float( 0 )  );

    /**
    * Set the value of the "price" attribute to "value" for this object.
    *
    * @param value the new value for the "price" attribute
    */
    public void set_price( float value ) {
        _price.setValue( value );
        _price.setTime( getTime() );
    }

    /**
    * Returns the value of the "price" attribute of this object.
    *
    * @return the value of the "price" attribute
    */
    public float get_price() {
        return _price.getValue();
    }

    /**
    * Returns the current timestamp of the "price" attribute of this object.
    *
    * @return the current timestamp of the "price" attribute
    */
    public double get_price_time() {
        return _price.getTime();
    }

    protected Attribute< Float > _quantity =
            new Attribute< Float >(  new Float( 0 )  );

    /**
    * Set the value of the "quantity" attribute to "value" for this object.
    *
    * @param value the new value for the "quantity" attribute
    */
    public void set_quantity( float value ) {
        _quantity.setValue( value );
        _quantity.setTime( getTime() );
    }

    /**
    * Returns the value of the "quantity" attribute of this object.
    *
    * @return the value of the "quantity" attribute
    */
    public float get_quantity() {
        return _quantity.getValue();
    }

    /**
    * Returns the current timestamp of the "quantity" attribute of this object.
    *
    * @return the current timestamp of the "quantity" attribute
    */
    public double get_quantity_time() {
        return _quantity.getTime();
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

    protected Attribute< Integer > _timeReference =
            new Attribute< Integer >(  new Integer( 0 )  );

    /**
    * Set the value of the "timeReference" attribute to "value" for this object.
    *
    * @param value the new value for the "timeReference" attribute
    */
    public void set_timeReference( int value ) {
        _timeReference.setValue( value );
        _timeReference.setTime( getTime() );
    }

    /**
    * Returns the value of the "timeReference" attribute of this object.
    *
    * @return the value of the "timeReference" attribute
    */
    public int get_timeReference() {
        return _timeReference.getValue();
    }

    /**
    * Returns the current timestamp of the "timeReference" attribute of this object.
    *
    * @return the current timestamp of the "timeReference" attribute
    */
    public double get_timeReference_time() {
        return _timeReference.getTime();
    }

    protected Attribute< String > _type =
            new Attribute< String >(  new String( "" )  );

    /**
    * Set the value of the "type" attribute to "value" for this object.
    *
    * @param value the new value for the "type" attribute
    */
    public void set_type( String value ) {
        _type.setValue( value );
        _type.setTime( getTime() );
    }

    /**
    * Returns the value of the "type" attribute of this object.
    *
    * @return the value of the "type" attribute
    */
    public String get_type() {
        return _type.getValue();
    }

    /**
    * Returns the current timestamp of the "type" attribute of this object.
    *
    * @return the current timestamp of the "type" attribute
    */
    public double get_type_time() {
        return _type.getTime();
    }

    protected Tender( ReflectedAttributes datamemberMap, boolean initFlag ) {
        super( datamemberMap, false );
        if ( initFlag ) setAttributes( datamemberMap );
    }

    protected Tender( ReflectedAttributes datamemberMap, LogicalTime logicalTime, boolean initFlag ) {
        super( datamemberMap, logicalTime, false );
        if ( initFlag ) setAttributes( datamemberMap );
    }

    /**
    * Creates an instance of the Tender object class, using
    * "datamemberMap" to initialize its attribute values.
    * "datamemberMap" is usually acquired as an argument to an RTI federate
    * callback method, such as "receiveInteraction".
    *
    * @param datamemberMap data structure containing initial values for the
    * attributes of this new Tender object class instance
    */
    public Tender( ReflectedAttributes datamemberMap ) {
        this( datamemberMap, true );
    }

    /**
    * Like {@link #Tender( ReflectedAttributes datamemberMap )}, except this
    * new Tender object class instance is given a timestamp of
    * "logicalTime".
    *
    * @param datamemberMap data structure containing initial values for the
    * attributes of this new Tender object class instance
    * @param logicalTime timestamp for this new Tender object class
    * instance
    */
    public Tender( ReflectedAttributes datamemberMap, LogicalTime logicalTime ) {
        this( datamemberMap, logicalTime, true );
    }

    /**
    * Creates a new Tender object class instance that is a duplicate
    * of the instance referred to by Tender_var.
    *
    * @param Tender_var Tender object class instance of which
    * this newly created Tender object class instance will be a
    * duplicate
    */
    public Tender( Tender Tender_var ) {
        super( Tender_var );

        set_price( Tender_var.get_price() );
        set_quantity( Tender_var.get_quantity() );
        set_tenderId( Tender_var.get_tenderId() );
        set_timeReference( Tender_var.get_timeReference() );
        set_type( Tender_var.get_type() );
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
        if ( "price".equals(datamemberName) ) return new Float(get_price());
        else if ( "quantity".equals(datamemberName) ) return new Float(get_quantity());
        else if ( "tenderId".equals(datamemberName) ) return new Integer(get_tenderId());
        else if ( "timeReference".equals(datamemberName) ) return new Integer(get_timeReference());
        else if ( "type".equals(datamemberName) ) return get_type();
        else return super.getAttribute( datamemberName );
    }

    protected boolean setAttributeAux( String datamemberName, String val ) {
        boolean retval = true;
        if ( "price".equals( datamemberName) ) set_price( Float.parseFloat(val) );
        else if ( "quantity".equals( datamemberName) ) set_quantity( Float.parseFloat(val) );
        else if ( "tenderId".equals( datamemberName) ) set_tenderId( Integer.parseInt(val) );
        else if ( "timeReference".equals( datamemberName) ) set_timeReference( Integer.parseInt(val) );
        else if ( "type".equals( datamemberName) ) set_type( val );
        else retval = super.setAttributeAux( datamemberName, val );

        return retval;
    }

    protected boolean setAttributeAux( String datamemberName, Object val ) {
        boolean retval = true;
        if ( "price".equals( datamemberName) ) set_price( (Float)val );
        else if ( "quantity".equals( datamemberName) ) set_quantity( (Float)val );
        else if ( "tenderId".equals( datamemberName) ) set_tenderId( (Integer)val );
        else if ( "timeReference".equals( datamemberName) ) set_timeReference( (Integer)val );
        else if ( "type".equals( datamemberName) ) set_type( (String)val );
        else retval = super.setAttributeAux( datamemberName, val );

        return retval;
    }

    @Override
    protected SuppliedAttributes createSuppliedDatamembers(boolean force) {
        SuppliedAttributes datamembers = _factory.createSuppliedAttributes();
 
        if (_publishAttributeNameSet.contains("price") && _price.shouldBeUpdated(force)) {
            datamembers.add( getAttributeHandle("price"), getAttribute("price").toString().getBytes() );
            _price.setHasBeenUpdated();
        }

        if (_publishAttributeNameSet.contains("quantity") && _quantity.shouldBeUpdated(force)) {
            datamembers.add( getAttributeHandle("quantity"), getAttribute("quantity").toString().getBytes() );
            _quantity.setHasBeenUpdated();
        }

        if (_publishAttributeNameSet.contains("tenderId") && _tenderId.shouldBeUpdated(force)) {
            datamembers.add( getAttributeHandle("tenderId"), getAttribute("tenderId").toString().getBytes() );
            _tenderId.setHasBeenUpdated();
        }

        if (_publishAttributeNameSet.contains("timeReference") && _timeReference.shouldBeUpdated(force)) {
            datamembers.add( getAttributeHandle("timeReference"), getAttribute("timeReference").toString().getBytes() );
            _timeReference.setHasBeenUpdated();
        }

        if (_publishAttributeNameSet.contains("type") && _type.shouldBeUpdated(force)) {
            datamembers.add( getAttributeHandle("type"), getAttribute("type").toString().getBytes() );
            _type.setHasBeenUpdated();
        }

        return datamembers;
    }

    public void copyFrom( Object object ) {
        super.copyFrom( object );
        if ( object instanceof Tender ) {
            Tender data = (Tender)object;
            _price = data._price;
            _quantity = data._quantity;
            _tenderId = data._tenderId;
            _timeReference = data._timeReference;
            _type = data._type;
        }
    }
}

