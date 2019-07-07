package collection.list;

import com.sun.istack.internal.NotNull;

import java.util.List;

public interface test extends List {

    void set();

    default int getIndex(){
        return 1;
    }

    @NotNull int size();
}
