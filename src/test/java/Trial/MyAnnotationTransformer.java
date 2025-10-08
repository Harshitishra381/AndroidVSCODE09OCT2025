package Trial;

import org.testng.IAnnotationTransformer;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import org.testng.annotations.ITestAnnotation;

public class MyAnnotationTransformer implements IAnnotationTransformer {
    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        System.out.println("Transformer applied to: " + (testMethod != null ? testMethod.getName() : "null method"));

            annotation.setRetryAnalyzer(RetryAnalyzer.class);
            System.out.println("RetryAnalyzer attached to: " + testMethod.getName());
        
    }
}
    
