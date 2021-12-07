package com.example.chatapplication

import android.content.IntentSender

class Message {
    var message: String? = null
    var senderID: String? = null

    constructor() {

    }

    constructor(message: String?, senderID: String?) {
        this.message = message
        this.senderID = senderID
    }

}