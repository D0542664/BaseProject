package D0542664;

import org.junit.Assert;
import org.junit.Test;

public class baseTest {
    @Test
    public void getType() throws Exception {
        // Arrange
        base triangle = new base(5, 10, 5);

        // Act
        String result = triangle.getType();

        // Assert
        Assert.assertEquals("不是三角形", result);
    }

}
