import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.RaspiPin;

public class BlinkingLed {

    public static void main(String[] args) {
    try {
        /** create gpio controller */
        final GpioController gpio = GpioFactory.getInstance();

        final GpioPinDigitalOutput ledPin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00);
        final GpioPinDigitalOutput ledPin1 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01);
        final GpioPinDigitalOutput ledPin2 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_02);
        final GpioPinDigitalOutput ledPin3 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_03);
        final GpioPinDigitalOutput ledPin4 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_04);
        final GpioPinDigitalOutput ledPin5 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_05);
        final GpioPinDigitalOutput ledPin6 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_06);
        final GpioPinDigitalOutput ledPin7 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_07);
        final GpioPinDigitalOutput ledPin8 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_08);
        final GpioPinDigitalOutput ledPin9 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_09);
        final GpioPinDigitalOutput ledPin10 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_10);
        final GpioPinDigitalOutput ledPin11 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_11);
        final GpioPinDigitalOutput ledPin12 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_12);
        final GpioPinDigitalOutput ledPin13 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_13);
        final GpioPinDigitalOutput ledPin14 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_14);
        final GpioPinDigitalOutput ledPin15 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_15);
        final GpioPinDigitalOutput ledPin16 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_16);
        final GpioPinDigitalOutput ledPin17 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_17);
        final GpioPinDigitalOutput ledPin18 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_18);
        final GpioPinDigitalOutput ledPin19 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_19);
        final GpioPinDigitalOutput ledPin20 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_20);
        final GpioPinDigitalOutput ledPin21 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_21);
        final GpioPinDigitalOutput ledPin22 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_22);
        final GpioPinDigitalOutput ledPin23 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_23);
        final GpioPinDigitalOutput ledPin24 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_24);
        final GpioPinDigitalOutput ledPin25 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_25);
        final GpioPinDigitalOutput ledPin26 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_26);
        final GpioPinDigitalOutput ledPin27 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_27);
        final GpioPinDigitalOutput ledPin28 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_28);
        final GpioPinDigitalOutput ledPin29 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_29);
        final GpioPinDigitalOutput ledPin30 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_30);

        /** Blink every second */
        ledPin1.blink(1000, 15000);
        ledPin2.blink(1000, 15000);
        ledPin3.blink(1000, 15000);
        ledPin4.blink(1000, 15000);
        ledPin5.blink(1000, 15000);
        ledPin6.blink(1000, 15000);
        ledPin7.blink(1000, 15000);
        ledPin8.blink(1000, 15000);
        ledPin9.blink(1000, 15000);
        ledPin10.blink(1000, 15000);
        ledPin11.blink(1000, 15000);
        ledPin12.blink(1000, 15000);
        ledPin13.blink(1000, 15000);
        ledPin14.blink(1000, 15000);
        ledPin15.blink(1000, 15000);/**/
		
       /**/
		ledPin16.blink(1000, 15000);
        ledPin17.blink(1000, 15000);
        ledPin18.blink(1000, 15000);
        ledPin19.blink(1000, 15000);
        ledPin20.blink(1000, 15000);
        ledPin21.blink(1000, 15000);
        ledPin22.blink(1000, 15000);
        ledPin23.blink(1000, 15000);
        ledPin24.blink(1000, 15000);
        ledPin25.blink(1000, 15000);
        ledPin26.blink(1000, 15000);
        ledPin27.blink(1000, 15000);
        ledPin28.blink(1000, 15000);
        ledPin29.blink(1000, 15000);
        ledPin30.blink(1000, 15000);

        /** keep program running until user aborts (CTRL-C) */
        while (true) {
        Thread.sleep(500);
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
    }
}