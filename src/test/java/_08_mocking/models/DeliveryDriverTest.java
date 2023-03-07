package _08_mocking.models;

import _07_intro_to_mocking.models.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class DeliveryDriverTest {

    DeliveryDriver deliveryDriver;
    
    @Mock
    Car car;
    
    @Mock
    CellPhone phone;

    @BeforeEach
    void setUp() {
    	MockitoAnnotations.openMocks(this);
    	deliveryDriver = new DeliveryDriver("Bob", car, phone);
    }

    @Test
    void itShouldWasteTime() {
    	boolean expectedWasteTime = true;
        //given
    	when(phone.browseCatMemes()).thenReturn(true);
        //when
    	boolean actualWasteTime = deliveryDriver.wasteTime();
        //then
    	assertEquals(expectedWasteTime, actualWasteTime);
    }

    @Test
    void itShouldRefuel() {
        //given
    boolean expectedRefuel = true;
        //when
    when(car.fillTank(0)).thenReturn(true);
    boolean actualRefuel = deliveryDriver.refuel(0);
    
    assertEquals(expectedRefuel, actualRefuel);
        //then
    }

    @Test
    void itShouldContactCustomer() {
    boolean expectedCall = true;
        //given
    	when(phone.call("000")).thenReturn(true);
        //when
    	boolean actualCall = deliveryDriver.contactCustomer("000");
    	//then
    	assertEquals(expectedCall, actualCall);
    }

}