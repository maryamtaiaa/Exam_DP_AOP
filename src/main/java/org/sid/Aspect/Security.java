package org.sid.Aspect;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

public @interface Security {
	String[] roles();
}
