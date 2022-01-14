package day11_Switch_Scanner;

public class Protocol {
    public static void main(String[] args) {
        int protocol=700;
        String statues;
        switch (protocol){
            case 200:
             statues="OK";
             break;
            case 201:
                statues="created";
                break;
            case 202:
                statues= "accepted";
                break;
            case 301:
                statues="Moved permanantly";
                break;
            case 303:
                statues="see other";
                break;
            case 304:
                statues="not modified";
                break;
            case 307:
                statues="temporary Redirect";
                break;
            case 400:
                statues="bad request";
                break;
            case 403:
                statues="Forbidden";
                break;
            case 404:
                statues="not found";
                break;
            case 410:
                statues="Gone";
                break;
            case 500:
                statues="internal server error";
                break;
            case 503:
                statues="service unavailable";
                break;
            default:
                statues="The number of this case is not found";
        }
        System.out.println("statues = " + statues);

    }
}

/*
 HTTP is the protocol that governs communications between web-servers and web clients. Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
    Some of the codes and their meanings are listed below:

            status code:
                200, OK
                201, Created
                202, Accepted
                301, Moved Permanently
                303, See Other
                304, Not Modified
                307, Temporary Redirect
                400, Bad Request
                401, Unauthorized
                403, Forbidden
                404, Not Found
                410, Gone
                500, Internal Server Error
                503, Service Unavailable


         declare an int variable called StatusCode, write a switch that prints out, on a line by itself, the appropriate label from the above list based on status.

                    Example:
                        if status code = 200

                    output:
                        ok
 */