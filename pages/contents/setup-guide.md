## **Setup Guide** 

### **Java Installation**

#### **Windows**
1. Download [Eclipse Temurin 11](https://adoptium.net/temurin/releases/?version=11)
2. Run installer → **Add to PATH** during installation
3. **Verify**:

```
java -version
# Should show "openjdk 11.x.x"
```

#### **macOS**

```
# Using Homebrew (recommended)
brew install temurin11

# Manual install
curl -L https://github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.20.1%2B1/OpenJDK11U-jdk_x64_mac_hotspot_11.0.20.1_1.tar.gz | tar xz
```

#### **Linux (Ubuntu)**

```
sudo apt update
sudo apt install openjdk-11-jdk
```

### **Git Installation** 

#### **All Systems**

```
# Windows (using Winget)
winget install Git.Git

# macOS
brew install git

# Linux
sudo apt install git
```

### **Terminal Setup** 

| Platform | Instructions                                                                                                                               |
| -------- | ------------------------------------------------------------------------------------------------------------------------------------------ |
| Windows  | 1. Install [Windows Terminal](https://aka.ms/terminal)  <br>2. Enable WSL ([guide](https://learn.microsoft.com/en-us/windows/wsl/install)) |
| macOS    | Use built-in Terminal (Finder → Utilities)                                                                                                 |
| Linux    | Use default terminal (Ctrl+Alt+T)                                                                                                          |

## **Pre-Workshop Verification** 

### **1. Full System Check**

```
# Run in terminal
java -version && \
javac -version && \
git --version && \
echo $SHELL
```

Expected output:

```
openjdk 11.0.20 2023-07-18
OpenJDK Runtime Environment Temurin-11.0.20+8 (build 11.0.20+8)
OpenJDK 64-Bit Server VM Temurin-11.0.20+8 (build 11.0.20+8, mixed mode)

git version 2.41.0
/bin/zsh
```

### **2. GitHub Configuration**

```
git config --global user.name "Your Name"
git config --global user.email "your@email.com"
git config --list  # Verify settings
```

## **Troubleshooting** 🚑

### **Common Issues**

1. **Java Not Found**:
    - Windows: Re-run installer with "Add to PATH"
    - macOS/Linux: Check `echo $PATH` contains Java bin
  
2. **Git Authentication Failed**:

```
# Use HTTPS instead of SSH
git config --global url."https://github.com/".insteadOf git@github.com:
```

3. **Permission Denied** (Linux/macOS):

```
chmod +x [*.sh]  # Repalce [*.sh] to the target file 
```

### Go Back to [Homepage](https://hackersclubsv.github.io/coe-coding-basics-bootcamp/)

## **Need Help?** 🆘

Contact the host Yang Jiang at:
<jiang.yang1@northeastern.edu>