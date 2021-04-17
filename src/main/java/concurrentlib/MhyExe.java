package concurrentlib;

import com.sun.istack.internal.NotNull;

// java.util.concurrent.Executor
public interface MhyExe {
    /**
     * Execute the given command
     * @param command the runnable task
     * @throws java.util.concurrent.RejectedExecutionException if the task cannot be accepted
     * @throws NullPointerException if the command is null
     */
    void exe(@NotNull Runnable command);
}
