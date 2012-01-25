package com.netflix.exhibitor.spi;

import com.netflix.exhibitor.Exhibitor;
import com.netflix.exhibitor.imps.StandardProcessOperations;
import com.netflix.exhibitor.state.InstanceState;

/**
 * Various inject-able operations. In most cases, you can use {@link StandardProcessOperations}
 */
public interface ProcessOperations
{
    /**
     * Start the instance
     *
     *
     * @throws Exception errors
     */
    public void         startInstance() throws Exception;

    /**
     * Kill the instance
     *
     * @throws Exception errors
     */
    public void         killInstance() throws Exception;

    /**
     * Perform an instance log/etc. cleanup
     *
     * @throws Exception errors
     */
    public void         cleanupInstance() throws Exception;
}
