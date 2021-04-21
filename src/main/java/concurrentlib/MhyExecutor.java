package concurrentlib;

import javax.validation.constraints.NotNull;

// java.util.concurrent.Executor
public interface MhyExecutor {
    /**
     * Execute the given command
     * @param command the runnable task
     * @throws java.util.concurrent.RejectedExecutionException if the task cannot be accepted
     * @throws NullPointerException if the command is null
     */
    void execute(@NotNull Runnable command);
}
