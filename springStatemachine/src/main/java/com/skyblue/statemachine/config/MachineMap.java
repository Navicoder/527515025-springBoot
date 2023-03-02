package com.skyblue.statemachine.config;

import java.util.HashMap;
import java.util.Map;

import com.skyblue.statemachine.config.events.FormEvents;
import com.skyblue.statemachine.config.events.OrderEvents;
import com.skyblue.statemachine.config.states.FormStates;
import com.skyblue.statemachine.config.states.OrderStates;
import org.springframework.statemachine.StateMachine;

/**存放
 * @author wphmo
 *
 */
public class MachineMap {
	public static Map<String,StateMachine<OrderStates, OrderEvents>> orderMap = new HashMap<String,StateMachine<OrderStates, OrderEvents>>();
	public static Map<String,StateMachine<FormStates, FormEvents>> formMap = new HashMap<String,StateMachine<FormStates, FormEvents>>();
}
