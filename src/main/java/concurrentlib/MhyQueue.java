package concurrentlib;

import java.util.Collection;

/**
 * The basic operations of a queue that contains add/poll/peek
 *
 * @since   20210417
 * @author  miaohongyuan
 * @param   <E> the type of elements held in this collection
 */
public interface MhyQueue<E> extends Collection<E> {
    /**
     * insert the special element into this queue
     *
     * @param e the element to add
     * @return {@code true} (as specialed by {@Link Collection#add})
     * @throws NullPointerException
     * @throws ClassCastException
     * @throws IllegalStateException if the element cannot be added to this queue
     *         due to the capacity restrictions
     */
    boolean add(E e);

    /**
     * return the element at head of queue, null if queue is empty
     * after this operation, the head element is removed
     *
     * @return the head of this queue or null
     */
    E poll();

    /**
     * return the element at head of queue, null if queue is emtpy
     * difference to poll(), the head element is not removed
     *
     * @return the head of this queue or null
     */
    E peek();
}
