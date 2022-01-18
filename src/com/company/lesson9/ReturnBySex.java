package com.company.lesson9;

import java.util.Collection;
import java.util.List;

public interface ReturnBySex {
    Collection<User> BySex(boolean isSex, Collection<User> collection);
}
