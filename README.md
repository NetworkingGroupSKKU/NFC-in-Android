NFC-in-Android
==============

NFC & NFC TAG

###INTRODUCTION OF THE APPLICATION###
As the development of IT industry, short-range wireless communication technologies such as Bluetooth, ZigBee, radio frequency identification (RFID), and near field communication (NFC) are being actively investigated and applied to various fields. It is noticeable that traditional short range communication technologies are facing with many issues nowadays. For example, the RFID technology only can support one way communication, or the Bluetooth technology requires a lot of time for finding a connection before exchanging the data. The problem of Bluetooth is also happened with Zigbee standard.
We present an NFC application which exploits NFC tag and NFC smart device to support future short range communication. We first provide a method for storing instructions in the NFC tag, and then present a way to allow smart device to execute those instructions automatically when receiving. Our objective is to provide a method of storing user’ instructions in the NFC tag and using them for some predefined scenarios desired by individual user. Then, this or other smart devices only need to communicate with NFC tag to receive the preloaded information and settings. The predefined information and settings are defined by the user based on the special scenario of their application or system. Nevertheless, the purposes sought to be achieved by the illustrative embodiments of the present disclosure are not limited to above descriptions. There are a lot of purposes of using those disclosures in many applications and system of our real life.
 
###EXISTING TECHNOLOGIES ISSUES###
Unlike the above technologies, the NFC technology overcomes the flaws in the RFID or Bluetooth/Zigbee technology and has been recently spotlighted. Especially, the NFC technology uses the frequency band of 13.56 MHz for both of reading and writing functionalities; It is possible to perform a bidirectional data transmission between same or different devices. Due to the short communication distance, the NFC technology is relatively excellent in security and cost. For example, NFC could be considered as a major communication technology in electronic payment, or even be served as an RFID reader.
 
 
###THE EXPLANATION OF THE APPLICATION###
We now explain the components of our disclosure in details. First, we consider an NFC tag which can receive the instruction from the tag writer (it is usually a NFC smart device). The instruction contains a set of functions and information. Whenever this NFC tag is located inside transmission range of a NFC reader (smart device). The NFC reader (smart device) can listen and receive the instructions (functions and information) from this tag. Those functions and information are defined for some special scenarios. Some function would be executed automatically based on the commands from received instruction.
Second, the smart device is supported NFC writing ability. Based on that, user can input their instructions to NFC tag. The instructions type is not limited; it can be text, commands, settings, .etc. Moreover, the smart device also has to be supported NFC reading ability. It can receive the instructions and execute settings and functions following the instruction.
Third, regarding the method of loading the instructions into the NFC tag, an application in a smart device need to be developed. This application is a common tool which provides the ability to input user instructions based on their scenario. Moreover, it also controls an NFC writer to transfer the instructions from smart device to the NFC tag.
The NFC tag, which is one of the technical means to achieve the purpose of the present disclosure as described above, stores instructions for a predefined scenario. The instruction from the user could contain two or more functions. The user can always load all the functions which supported by the smart device application. The NFC tag has enough memory space to store all the instructions provided from smart device at any iteration.
The core technology of the present disclosure relates to integrating and storing multiple functions desired by a user in one NFC tag. Conventionally, a user has been only allowed to use a function designated by a company or a vendor. However, with the present disclosure, a user can easily select his/her own desired functions, and then, integrate the functions in one NFC tag and use them.
In addition, it has been possible to use only one function with one NFC tag. However, with the present disclosure, multiple functions can be loaded through one reading of an NFC tag.
A smart device, which is one of the technical means to achieve the purpose of the present disclosure as described above, includes its dedicated application so that a user is not only in the position that he/she simply receives data, but also can serve as a customized data provided by for themselves.
With respect to a method for executing instructions stored in an NFC tag, one of the technical means to achieve the purpose of the present disclosure as described above, two or more functions are automatically executed in a smart device according to the received instructions from NFC tag. Accordingly, it is possible to prevent an unnecessary function from being first executed, so that the smart device can be automatically configured and effectively controlled.
