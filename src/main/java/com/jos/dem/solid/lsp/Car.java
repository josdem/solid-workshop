package com.jos.dem.solid.lsp;

public class Car implements Vehicle {

  @Override
	public void stop() {
    System.out.println("Pressing brake");
	}

	@Override
	public void moveForward() {
    System.out.println("Moving Gear to D");
    System.out.println("Pressing Gas accelerator");
	}

}