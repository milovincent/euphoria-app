package io.euphoria.xkcd.app.connection;

/** Created by Xyzzy on 2017-02-24. */

/* Main entry point of the connection submodule */
public interface ConnectionManager {

    /* Get connection for room name
     *
     * If there is no connection to the room, null is returned. Since that would initiate I/O, lazy creation is not
     * provided.
     */
    Connection getConnection(String roomName);

    /* Connect to a room
     *
     * If a connection is already present, this is equivalent to getConnection().
     */
    Connection connect(String roomName);

}
