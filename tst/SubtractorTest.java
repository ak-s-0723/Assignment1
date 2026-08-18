public class SubtractorTest {
   public void testSubtract() {
     Subtractor subtractor = new Subtractor();
     int result = subtractor.subtract(5,3);
     assert(result==2);
   }
}
