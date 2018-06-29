package TEChallenge;

import hla.rti.EventRetractionHandle;
import hla.rti.LogicalTime;
import hla.rti.ReceivedInteraction;

import org.cpswt.hla.C2WInteractionRoot;
import org.cpswt.hla.InteractionRoot;
import org.cpswt.hla.SubscribedInteractionFilter;
import org.cpswt.hla.SynchronizedFederate;

import org.cpswt.config.FederateConfig;

import org.cpswt.*;

public class LoadBase extends SynchronizedFederate {

	private SubscribedInteractionFilter _subscribedInteractionFilter = new SubscribedInteractionFilter();
	
	// constructor
	public LoadBase(FederateConfig config) throws Exception {
		super(config);

		super.createLRC();
		super.joinFederation();

		enableTimeConstrained();

		enableTimeRegulation(getLookAhead());
		enableAsynchronousDelivery();
        // interaction pubsub
        
        		
		// object pubsub
        
        	
        resourcesPhysicalStatus.publish_current_Imaginary_A();
        resourcesPhysicalStatus.publish_current_Imaginary_B();
        resourcesPhysicalStatus.publish_current_Imaginary_C();
        resourcesPhysicalStatus.publish_current_Real_A();
        resourcesPhysicalStatus.publish_current_Real_B();
        resourcesPhysicalStatus.publish_current_Real_C();
        resourcesPhysicalStatus.publish_gridNodeId();
        resourcesPhysicalStatus.publish_impedance_Imaginary_A();
        resourcesPhysicalStatus.publish_impedance_Imaginary_B();
        resourcesPhysicalStatus.publish_impedance_Imaginary_C();
        resourcesPhysicalStatus.publish_impedance_Real_A();
        resourcesPhysicalStatus.publish_impedance_Real_B();
        resourcesPhysicalStatus.publish_impedance_Real_C();
        resourcesPhysicalStatus.publish_phases();
        resourcesPhysicalStatus.publish_power_Imaginary_A();
        resourcesPhysicalStatus.publish_power_Imaginary_B();
        resourcesPhysicalStatus.publish_power_Imaginary_C();
        resourcesPhysicalStatus.publish_power_Real_A();
        resourcesPhysicalStatus.publish_power_Real_B();
        resourcesPhysicalStatus.publish_power_Real_C();
        resourcesPhysicalStatus.publish_status();
        resourcesPhysicalStatus.publish_voltage_Imaginary_A();
        resourcesPhysicalStatus.publish_voltage_Imaginary_B();
        resourcesPhysicalStatus.publish_voltage_Imaginary_C();
        resourcesPhysicalStatus.publish_voltage_Real_A();
        resourcesPhysicalStatus.publish_voltage_Real_B();
        resourcesPhysicalStatus.publish_voltage_Real_C();
        resourcesPhysicalStatus.publish(getLRC());
                
        	
        gridVoltageState.subscribe_grid_Voltage_Imaginary_A();
        gridVoltageState.subscribe_grid_Voltage_Imaginary_B();
        gridVoltageState.subscribe_grid_Voltage_Imaginary_C();
        gridVoltageState.subscribe_grid_Voltage_Real_A();
        gridVoltageState.subscribe_grid_Voltage_Real_B();
        gridVoltageState.subscribe_grid_Voltage_Real_C();
        gridVoltageState.subscribe(getLRC());
        	}
        
	
	@Override
	public void receiveInteraction(
	 int interactionClass, ReceivedInteraction theInteraction, byte[] userSuppliedTag
	) {
		InteractionRoot interactionRoot = InteractionRoot.create_interaction( interactionClass, theInteraction );
		if ( interactionRoot instanceof C2WInteractionRoot ) {
			
			C2WInteractionRoot c2wInteractionRoot = (C2WInteractionRoot)interactionRoot;

	        // Filter interaction if src/origin fed requirements (if any) are not met
	        if (  _subscribedInteractionFilter.filterC2WInteraction( getFederateId(), c2wInteractionRoot )  ) {
	        	return;
	        } 
		}
		
		super.receiveInteraction( interactionClass, theInteraction, userSuppliedTag );			
	}

	@Override
	public void receiveInteraction(
	 int interactionClass,
	 ReceivedInteraction theInteraction,
	 byte[] userSuppliedTag,
	 LogicalTime theTime,
	 EventRetractionHandle retractionHandle
	) {
		InteractionRoot interactionRoot = InteractionRoot.create_interaction( interactionClass, theInteraction, theTime );
		if ( interactionRoot instanceof C2WInteractionRoot ) {

			C2WInteractionRoot c2wInteractionRoot = (C2WInteractionRoot)interactionRoot;

	        // Filter interaction if src/origin fed requirements (if any) are not met
	        if (  _subscribedInteractionFilter.filterC2WInteraction( getFederateId(), c2wInteractionRoot )  ) {
	        	return;
	        } 
		}

		super.receiveInteraction( interactionClass, theInteraction, userSuppliedTag, theTime, retractionHandle );			
	}
}
