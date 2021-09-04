package com.gymhelper.app.security.request;

import java.util.Date;

public class ErrorResponse
{
    private final Date timestamp;
    private final int status;
    private final String error;
    private final String message;

    public ErrorResponse(Date timestamp, int status, String error, String message)
    {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.message = message;
    }

    public Date getTimestamp()
    {
        return timestamp;
    }

    public int getStatus()
    {
        return status;
    }

    public String getError()
    {
        return error;
    }

    public String getMessage()
    {
        return message;
    }
}
