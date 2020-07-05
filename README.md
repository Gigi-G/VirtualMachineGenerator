# Virtual Machine Generator

------

- **[Test](#Test)**
- **[Description](#Description)**
- **[How to use it](#how-to-use-it)**
- **[Example](#Example)**

------

## Test
![build](https://github.com/Gigi-G/VirtualMachineGenerator/workflows/Java%20CI%20with%20Maven/badge.svg)




## Description

```
 __      ____  __  _____                           _             
 \ \    / /  \/  |/ ____|                         | |            
  \ \  / /| \  / | |  __  ___ _ __   ___ _ __ __ _| |_ ___  _ __ 
   \ \/ / | |\/| | | |_ |/ _ \ '_ \ / _ \ '__/ _` | __/ _ \| '__|
    \  /  | |  | | |__| |  __/ | | |  __/ | | (_| | || (_) | |   
     \/   |_|  |_|\_____|\___|_| |_|\___|_|  \__,_|\__\___/|_|   
                                                                 
                                                                 
```

Virtual Machine Generator is a simple multiplatform application that you can use to generate a specify number of clones in VirtualBox.



## Hoe to use it

1. Clone or Download this repository

2. Open terminal and use this commands:

   ```bash
   cd ~/VirtualMachineGenerator/target
   java -cp VirtualMachineGenerator-1.0-SNAPSHOT.jar com.gigi_g.virtualmachinegenerator.App
   ```

3. Follow the instructions and enjoy it :-)



## Example

```bash
Enter the name of the machine you want to clone: TestBaseMachine
VBoxManage snapshot TestBaseMachine delete Snapshot
VBoxManage snapshot TestBaseMachine take Snapshot

Enter the number of virtual machines to be created: 3

Enter the name of the new clone: A
VBoxManage clonevm TestBaseMachine --snapshot Snapshot --name A --options link --register
Network card nic1 intnet/[none]: intnet 
Enter the name of the lan for nic1: lan01
Network card nic2 intnet/[none]: none
Network card nic3 intnet/[none]: none
Network card nic4 intnet/[none]: none
VBoxManage modifyvm A --nic1 intnet --intnet1 lan01 --nic2 none --nic3 none --nic4 none

Enter the name of the new clone: B 
VBoxManage clonevm TestBaseMachine --snapshot Snapshot --name B --options link --register
Network card nic1 intnet/[none]: intnet
Enter the name of the lan for nic1: lan01
Network card nic2 intnet/[none]: intnet
Enter the name of the lan for nic2: lan02
Network card nic3 intnet/[none]: none
Network card nic4 intnet/[none]: none
VBoxManage modifyvm B --nic1 intnet --intnet1 lan01 --nic2 intnet --intnet2 lan02 --nic3 none --nic4 none

Enter the name of the new clone: C 
VBoxManage clonevm TestBaseMachine --snapshot Snapshot --name C --options link --register
Network card nic1 intnet/[none]: none
Network card nic2 intnet/[none]: intnet
Enter the name of the lan for nic2: lan02
Network card nic3 intnet/[none]: none
Network card nic4 intnet/[none]: none
VBoxManage modifyvm C --nic1 none --nic2 intnet --intnet2 lan02 --nic3 none --nic4 none
```

