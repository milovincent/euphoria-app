package io.euphoria.xkcd.app.ui;

/** Created by Xyzzy on 2017-02-24. */

/* Room UI wrapper retrieval hub */
public interface RoomUIManager {

    /* Get the room UI for the given name */
    RoomUI getRoomUI(String roomName);

}
