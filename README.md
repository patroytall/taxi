# taxi - incomplete - only a small amount of code has been implemented

Application requirements:
You will simulate a taxi dispatching station having a pool of taxis serving customers.

The station has two types of taxis: blue and red. Blue taxis are 50% more efficient at serving customers than normal red taxis. The number of blue and red taxis available to the station is configurable. For example, 2 blue and 3 red.

Customers request taxis at a random number of seconds interval. The interval value is within a configurable range in seconds. For example 1-5 seconds. Each customer request includes a service time in seconds. The value of the service time for each request is random based on a configurable range. For example, 10-30 seconds.

The application must dispatch taxis whenever a request is made. A taxi serving a request is busy for the duration of the service request time factoring is efficient factor. In other words, a red taxi is busy for the service request time while a blue only for half the time. When a taxi is busy serving a request it cannot serve an other request at the same time.

At every 10 seconds interval, the application must print a full status of all its taxis and service requests: how many red and blue taxis at the station, a list of taxis serving requests and their time to completion. A count of pending service requests.
