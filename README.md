Work in progress!

Notes:
There is a session manager who manages the sessions for the system.
Each session might require some security verification process like exchanging  certificates.
Though uncommon, each session might have multiple transport to support them.
For flaky networks, the overall cost of session establishment might be high and therefore we might like to reduce
them via some suitable strategies.

Thus the library would work on a contract of a generic session establishment strategy/protocol.
So, if there exist any security verification process, then, it is likely to be a part of it.
The retrial strategy is a different issue all-together.
The session is transport agnostic so there will be some transport layer contract.
