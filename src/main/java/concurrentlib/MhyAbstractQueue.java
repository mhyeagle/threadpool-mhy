package concurrentlib;

import java.util.AbstractCollection;

/**
 * This class provide some skeletal implements of some {@Link MhyQueue} operations
 *
 * @since 20210417
 * @param <E> the type of elements held in this collection
 * @author miaohongyuan
 */
public abstract class MhyAbstractQueue<E>
        extends AbstractCollection<E>
        implements MhyQueue<E> {
    /**
     * Constructor for use by subclasses.
     */
    protected MhyAbstractQueue() {}

    
}
