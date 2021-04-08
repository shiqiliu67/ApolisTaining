# Git

Git is a distributed version control system or source code management system.
Git was designed by the same developer who developed the Linux kernel
Git is free software distributed under GNU license

# Version control system (VCS)
It is software that helps the software developer to work together and maintain a complete
history of their work

> Allows developers to work together
> Prevent overwriting each other change
> Maintain a history of every version


# Type of version control system
> Centralized version control system
> Decentralized / distributed version control system


# Centralized version control system uses a central server to store all files and folders and enable the team to collaborate. But the major drawback of CVCS is its single point of failure
What if the central server goes down for an hour, then no one can collaborate during that time. If that central server gets corrupted or broken, you will lose the entire history
of the project.


# Distributed version control system we check out the directory's latest snapshot
and take a complete mirror image of the repository. If the server goes down, then the repository
from any client can be copied back to the server.


Git does not rely on a central server as it may perform many operations when you are offline
you can commit, add, create a branch, view logs, and perform all other operations even when you
offline, and we need a network connection only to publish your changes


# Git vs. GitHub
Git - actual source code management tool
GitHub - cloud server which offers space to manage source code on the cloud



# Advantages of Git
> Free and Open source - It is available freely over the internet, which means you can download
 and start using git for free to manage your project code

> Fast
As most of the operation perform locally, it is a massive benefit in terms of speed
the core part of the git is written in C language, which avoids any runtime overhead associated 
with other high-level languages

> implicit backup
The chances of losing data are very rare when you have multiple copies of it. Data present on 
any disk can be used for restoring purpose

> security
git uses a common cryptographic function, SHA1 (secure hash function), to name and identify
an object within its database

> No Powerful hardware
In the case of a centralized version control server, it needs to be powerful enough to serve the entire team's request. In the case of distributed  version, developer doesn't interact with the 
server unless they need to push or pull changes.

> Branch
It is very easy to create a distributed version control system
centralized version control system that generally follows copy mechanism f. We create a new branch it will copy
all the codes to the new branch



> untracked
> staged
> commit

Repository -> project directory
Local Repository -> store locally on the machine
Remote Repository -> store on remote server / Github

# Git Commands

> git --version

> git config --list
> git config --global user.name
> git config --global user.email
> git config --global user.name "<name>"
> git config --global user.email "<email>"

> git init
> git status
> git add <file_name>
> git add .
> git rm --cache <file_name>
> git commit -m "<commit message>"

> git remote -v
> git remote add origin <github_url>

> git push origin master

> git clone <url>











