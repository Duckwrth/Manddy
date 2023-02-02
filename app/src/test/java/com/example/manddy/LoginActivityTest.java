package com.example.manddy;

import static org.junit.Assert.*;
import org.junit.Test;

@RunWith(MockitoJUnitRunner.class)
public class LoginUnitTest {

    private static final String FAKE_STRING = "Login was successful";

    @Mock
    Context mMockContext;

    @Test
    public void readStringFromContext_LocalizedString() {

        LoginActivity myObjectUnderTest = new LoginActivity(mMockContext);

        // ...when the string is returned from the object under test...
        String result = myObjectUnderTest.validate("user","user");

        // ...then the result should be the expected one.
        assertThat(result, is(FAKE_STRING));
    }

}