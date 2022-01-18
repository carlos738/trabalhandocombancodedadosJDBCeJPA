package classes;

import javax.persistence.GenerationType;

public @interface GeneratedValue {
    GenerationType strategy();
}
