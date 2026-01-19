# LeetCode Solutions 🚀

> Automated collection of my LeetCode problem solutions, synced and organized via CI/CD pipeline

---

## Overview

This folder contains my solutions to various LeetCode problems, automatically synced and organized through an automated workflow. Every solution is committed directly from LeetCode submissions and intelligently organized for easy retrieval.

---

## How It Works ⚙️

### 1. **Solve on LeetCode** 💻
I solve problems directly on [LeetCode.com](https://leetcode.com) using their online editor.

### 2. **Auto-Sync via LeetHub** 🔄
- **LeetHub** Chrome extension monitors my LeetCode submissions
- On successful submission, it automatically commits the solution to this repository
- Each problem is saved with its metadata (title, difficulty, runtime, memory stats)

### 3. **Auto-Organization via GitHub Actions** 🤖
- A **CI/CD pipeline** (GitHub Actions workflow) detects new commits
- Automatically moves problem folders into organized structure
- Maintains clean repository organization without manual intervention

**Workflow:**
```
LeetCode Submit → LeetHub Sync → GitHub Actions → Organized in /Leetcode/
```

---

## Tech Stack 🛠️

| Technology | Purpose |
|------------|---------|
| **LeetCode** | Problem solving platform |
| **LeetHub** | Chrome extension for auto-sync |
| **GitHub Actions** | CI/CD automation for organization |
| **Python/C++/Java** | Primary languages for solutions |

---

## Folder Structure 📁

```
Leetcode/
├── 0001-two-sum/
│   ├── 0001-two-sum.py
│   └── README.md
├── 0026-remove-duplicates-from-sorted-array/
│   ├── 0026-remove-duplicates-from-sorted-array.py
│   └── README.md
└── ...
```

Each problem folder contains:
- **Solution file(s)** - Accepted code in one or more languages
- **README.md** - Problem description, constraints, and examples

---

## Automation Pipeline 🔧

### GitHub Actions Workflow

The automation is powered by a custom GitHub Actions workflow:

**Trigger:** Every push to the repository  
**Process:**
1. Detects LeetCode problem folders (format: `####-problem-name`)
2. Moves them into the `/Leetcode/` directory
3. Commits changes with automated message
4. Maintains clean repository structure

**Benefits:**
✅ Zero manual file organization  
✅ Consistent folder structure  
✅ Automatic commit history  
✅ Easy problem retrieval  

---

## Statistics 📊

## Statistics 📊

![LeetCode Stats](https://leetcode-badge.vercel.app/api/sarvatarshan20?theme=dark)

- **Total Problems Solved:** ![Solved](https://img.shields.io/badge/dynamic/json?color=orange&label=Solved&query=solvedOverTotal&url=https%3A%2F%2Fleetcode-badge.vercel.app%2Fapi%2Fusers%2Fsarvatarshan20&logo=leetcode&style=flat-square)
- **Easy:** ![Easy](https://img.shields.io/badge/dynamic/json?color=green&label=Easy&query=easySolved&url=https%3A%2F%2Fleetcode-badge.vercel.app%2Fapi%2Fusers%2Fsarvatarshan20&logo=leetcode&style=flat-square)
- **Medium:** ![Medium](https://img.shields.io/badge/dynamic/json?color=yellow&label=Medium&query=mediumSolved&url=https%3A%2F%2Fleetcode-badge.vercel.app%2Fapi%2Fusers%2Fsarvatarshan20&logo=leetcode&style=flat-square)
- **Hard:** ![Hard](https://img.shields.io/badge/dynamic/json?color=red&label=Hard&query=hardSolved&url=https%3A%2F%2Fleetcode-badge.vercel.app%2Fapi%2Fusers%2Fsarvatarshan20&logo=leetcode&style=flat-square)
- **Languages Used:** Java, Python, SQL
- **Automated Commits:** 100% via LeetHub + GitHub Actions

---


## Connect & Collaborate 🤝

Found a better solution? Spotted an optimization? Feel free to:
- Open an issue for discussion
- Submit a pull request with improvements
- Share alternative approaches

---

## Acknowledgments 🙏

- **LeetCode** - For the excellent problem-solving platform
- **LeetHub** - For seamless GitHub integration
- **GitHub Actions** - For powerful CI/CD automation

---

<div align="center">

**Happy Coding! 💻✨**

*Last Updated: Automated via GitHub Actions*

</div>
