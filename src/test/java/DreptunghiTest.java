import org.junit.Assert;
import org.junit.Test;

public class DreptunghiTest {

    @Test
    public void testDreptunghi(){
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle(2,5);
        Assert.assertEquals(10, rectangle1.getArea());
        Assert.assertEquals(1, rectangle.getArea());
        Assert.assertEquals(14, rectangle1.getPerimeter());
        Assert.assertEquals(4, rectangle.getPerimeter());
    }
}
