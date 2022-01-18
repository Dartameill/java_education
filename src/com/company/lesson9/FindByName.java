package com.company.lesson9;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public interface FindByName {
    Collection<User> ByName(String name, Collection<User> collection);

}
