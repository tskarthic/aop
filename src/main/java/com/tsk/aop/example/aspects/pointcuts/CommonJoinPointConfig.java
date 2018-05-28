package com.tsk.aop.example.aspects.pointcuts;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

	@Pointcut("execution(* com.tsk.aop.example.dao.*.*(..))")
	public void dataLayerExecution(){}
	
	@Pointcut("execution(* com.tsk.aop.example.business.*.*(..))")
	public void businessLayerExecution(){}
}
