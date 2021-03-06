IS24 API SDK v0.2.16 (restapi-java-sdk)
==========================
Author:     Martin Flügge

Copyright:  Immobilien Scout GmbH

Link:       http://www.immobilienscout24.de


Das IS24 API SDK von ImmobilienScout24 steht unter der Apache Common License v2.0 zur Verfügung und kann für private sowie kommerzielle Projekte eingesetzt werden. Lediglich die Verweise wie Copyright, Autor, etc. müssen in den Dateien erhalten bleiben. Weitere Infos zur Lizenz befinden sich unter http://www.apache.org/licenses/LICENSE-2.0.

History
=======


Who  		  | When 		  | What
------------- | ------------- | -------------
mfluegge  	  | 10th June 2014| initial commit
mfluegge  	  | 10th June 2014| v0.1 beta
mfluegge  	  | 3th November 2014| v0.2 beta
mfluegge  	  | 4th November 2014| v0.2.3
dsostin  	  | 26th February 2015| v0.2.9
dsostin  	  | 02th July 2015| v0.2.10
fmielke       | 31th August 2015| v0.2.11
fmielke       | 5th September 2016| v0.2.15
mfluegge      | 5th February 2018| v0.2.16


v0.2.16
----------

Ensured that "https" is mandatory as IS24 will not support "http" anymore.

v0.2.15
----------

Delete xml-non-confirm characters at reading response bodies as xml.

v0.2.11
----------

bugfix POST attachment(url)

v0.2.10
----------
sdk make all requests using https.

v0.2.9
----------

bug fix for create video attachment

v0.2.3
----------

Added externalId, message and messageCode to ShowcasePlacement, TopPlacment and PremiumPlacement.

v0.2.1
----------

Had to change artifactid to "restapi-java-sdk".

v0.2 beta
----------

- createRealestate(String username, RealEstate realestate) uses energy certificate data by default
- update realeste
- upload of FileMultimediaObject now throw MaximumNumberOfAttachmentsReachedException when trying to upload attchment #31
- user can retrieve realestate project for a given realestate id
- realestate projects can be upated
- several methods to add realestates to a realestes projects were introduced
- realestates can be deleted from realestate projects
- On top products can be placed on realestates
- user can retrieve a list of on top products placed an a specific realestate
- On top products can be removed from realestates
- user can get a list of entitlements for a given username
- user can get a specific entitlement by name for a given user
