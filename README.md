Work in progress!

Notes:

Why do we need sessions?
Sessions typically store some state associated with the user however this state is intended to be stored for a fixed
timeout and not permanently. They are required when we work over stateless protocols like Http or even SMS.

Example/Usage?
shopping carts - we need to remember all the products that user selects even if the user is on payment page or simply
browsing other products.

For now this library will be restricted to establish sessions over Http and SMS (application level stateless protocols).
So even though they are application level protocols, they will be treated as some kind of higher level of transport
layer protocol.

There is a session manager who manages the sessions for the system.
Each session might require some security verification process like exchanging  certificates.
Though uncommon, each session might have multiple transport to support them.
For flaky networks, the overall cost of session establishment might be high and therefore we might like to reduce
them via some suitable strategies.

Thus the library would work on a contract of a generic session establishment strategy/protocol.
So, if there exist any security verification process, then, it is likely to be a part of it.
The retrial strategy is a different issue all-together.
The session is transport agnostic so there will be some transport layer contract.

Question

1) Does session establishment protocol restrict the choice of transport we are using? (e.g. http, sms, or even TCP, UDP.)
Mentioning them should be optional and in an elegant way.
Since it should not, the challenge is to model them in a flexible way.

One of the ideas is to introduce a transport picker who is able to return the list of transport protocols that can
complete any arbitrary request.