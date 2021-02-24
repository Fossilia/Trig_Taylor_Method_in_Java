import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class TrigTest {
    Trig t;
    double x;

    @BeforeEach
    public void setUp() {
        t = new Trig();
        x = Math.PI;
    }

    @Test
    public void sine_func() {
        // testing values right on all the quadrant lines
        assertEquals(t.sine_func(0), Math.sin(0), 0.0001);
        assertEquals(t.sine_func(t.convert_to_Radians(0)) ,Math.sin(0), 0.0001);

        assertEquals(t.sine_func((Math.PI)/2), Math.sin((Math.PI)/2), 0.0001);
        assertEquals(t.sine_func(t.convert_to_Radians(90)) ,Math.sin((Math.PI)/2), 0.0001);

        assertEquals(t.sine_func(Math.PI), Math.sin(Math.PI), 0.0001);
        assertEquals(t.sine_func(t.convert_to_Radians(180)) ,Math.sin((Math.PI)), 0.0001);

        assertEquals(t.sine_func((3*(Math.PI))/2), Math.sin((3*(Math.PI))/2), 0.0001);
        assertEquals(t.sine_func(t.convert_to_Radians(270)) ,Math.sin((3*(Math.PI)/2)), 0.0001);


        // testing values on each of the four quadrants
        assertEquals(t.sine_func((Math.PI)/4), Math.sin((Math.PI)/4), 0.0001);
        assertEquals(t.sine_func(t.convert_to_Radians(45)) ,Math.sin((Math.PI)/4), 0.0001);

        assertEquals(t.sine_func((3*(Math.PI))/4), Math.sin((3*(Math.PI))/4), 0.0001);
        assertEquals(t.sine_func(t.convert_to_Radians(135)) ,Math.sin(3*(Math.PI)/4), 0.0001);

        assertEquals(t.sine_func((5*(Math.PI))/4), Math.sin((5*(Math.PI))/4), 0.0001);
        assertEquals(t.sine_func(t.convert_to_Radians(225)) ,Math.sin((5*Math.PI)/4), 0.0001);

        assertEquals(t.sine_func((7*(Math.PI))/4), Math.sin((7*(Math.PI))/4), 0.0001);
        assertEquals(t.sine_func(t.convert_to_Radians(315)) ,Math.sin((7*Math.PI)/4), 0.0001);

        //boundary testing, we used big positive numbers and negative
        assertEquals(t.sine_func(-100000), Math.sin(-100000), 0.0001);
        assertEquals(t.sine_func(100000), Math.sin(100000), 0.0001);

    }

    @Test
    public void cos_func() {
        // testing values right on all the quadrant lines
        assertEquals(t.cos_func(0), Math.cos(0), 0.0001);
        assertEquals(t.cos_func(t.convert_to_Radians(0)) ,Math.cos(0), 0.0001);

        assertEquals(t.cos_func((Math.PI)/2), Math.cos((Math.PI)/2), 0.0001);
        assertEquals(t.cos_func(t.convert_to_Radians(90)) ,Math.cos((Math.PI)/2), 0.0001);

        assertEquals(t.cos_func(Math.PI), Math.cos(Math.PI), 0.0001);
        assertEquals(t.cos_func(t.convert_to_Radians(180)) ,Math.cos((Math.PI)), 0.0001);

        assertEquals(t.cos_func((3*(Math.PI))/2), Math.cos((3*(Math.PI))/2), 0.0001);
        assertEquals(t.cos_func(t.convert_to_Radians(270)) ,Math.cos((3*(Math.PI)/2)), 0.0001);


        // testing values on each of the four quadrants
        assertEquals(t.cos_func((Math.PI)/4), Math.cos((Math.PI)/4), 0.0001);
        assertEquals(t.cos_func(t.convert_to_Radians(45)) ,Math.cos((Math.PI)/4), 0.0001);

        assertEquals(t.cos_func((3*(Math.PI))/4), Math.cos((3*(Math.PI))/4), 0.0001);
        assertEquals(t.cos_func(t.convert_to_Radians(135)) ,Math.cos(3*(Math.PI)/4), 0.0001);

        assertEquals(t.cos_func((5*(Math.PI))/4), Math.cos((5*(Math.PI))/4), 0.0001);
        assertEquals(t.cos_func(t.convert_to_Radians(225)) ,Math.cos((5*Math.PI)/4), 0.0001);

        assertEquals(t.cos_func((7*(Math.PI))/4), Math.cos((7*(Math.PI))/4), 0.0001);
        assertEquals(t.cos_func(t.convert_to_Radians(315)) ,Math.cos((7*Math.PI)/4), 0.0001);

        //boundary testing, we used big positive numbers and negative
        assertEquals(t.cos_func(-100000), Math.cos(-100000), 0.0001);
        assertEquals(t.cos_func(100000), Math.cos(100000), 0.0001);
    }

    @Test
    public void tan_func() {
        // testing values right on all the quadrant lines
        assertEquals(t.tan_func(0), Math.sin(0), 0.0001);
        assertEquals(t.tan_func(t.convert_to_Radians(0)) ,Math.sin(0), 0.0001);

        assertEquals(t.tan_func((Math.PI)/2), Math.sin((Math.PI)/2), 0.0001);
        assertEquals(t.tan_func(t.convert_to_Radians(90)) ,(Math.PI)/2, 0.0001);

        assertEquals(t.tan_func(Math.PI), Math.sin(Math.PI), 0.0001);
        assertEquals(t.tan_func(t.convert_to_Radians(180)) ,(Math.PI), 0.0001);

        assertEquals(t.tan_func((3*(Math.PI))/2), Math.sin((3*(Math.PI))/2), 0.0001);
        assertEquals(t.tan_func(t.convert_to_Radians(270)) ,(3*(Math.PI)/2), 0.0001);

        assertEquals(t.tan_func((2*Math.PI)), Math.sin((2*Math.PI)/2), 0.0001);
        assertEquals(t.tan_func(t.convert_to_Radians(360)) ,(2*Math.PI), 0.0001);

        // testing values on each of the four quadrants
        assertEquals(t.tan_func((Math.PI)/4), Math.sin((Math.PI)/4), 0.0001);
        assertEquals(t.tan_func(t.convert_to_Radians(45)) ,(Math.PI)/4, 0.0001);

        assertEquals(t.tan_func((3*(Math.PI))/4), Math.sin((3*(Math.PI))/4), 0.0001);
        assertEquals(t.tan_func(t.convert_to_Radians(135)) ,(3*(Math.PI)/4), 0.0001);

        assertEquals(t.tan_func((5*(Math.PI))/4), Math.sin((5*(Math.PI))/4), 0.0001);
        assertEquals(t.tan_func(t.convert_to_Radians(225)) ,((5*Math.PI)/4), 0.0001);

        assertEquals(t.tan_func((7*(Math.PI))/4), Math.sin((7*(Math.PI))/4), 0.0001);
        assertEquals(t.tan_func(t.convert_to_Radians(315)) ,((7*Math.PI)/4), 0.0001);

        //boundary testing, we used big positive numbers and negative
        assertEquals(t.tan_func(-100000), Math.sin(0), 0.0001);
        assertEquals(t.tan_func(100000), Math.sin(0), 0.0001);
    }
}