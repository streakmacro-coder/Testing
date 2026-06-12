# Minecraft Launcher - Android

A feature-rich Minecraft launcher for Android with Microsoft account authentication, multiple account management, and support for mods and resource packs.

## Features

- 🎮 Find and launch installed Minecraft apps
- 🔐 Microsoft account authentication and sign-in
- 👥 Multiple account management (unlimited accounts)
- 📦 Add and manage mods and resource packs
- 🎨 Clean, intuitive user interface

## Tech Stack

- **Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Architecture**: MVVM with Clean Architecture
- **Authentication**: Microsoft OAuth 2.0
- **Database**: Room (SQLite)

## Project Structure

```
app/
├── src/
│   └── main/
│       ├── kotlin/
│       │   └── com/streakmacro/minecraftlauncher/
│       │       ├── ui/
│       │       ├── data/
│       │       ├── domain/
│       │       └── MainActivity.kt
│       └── res/
└── build.gradle.kts
```

## Getting Started

1. Clone the repository
2. Open in Android Studio
3. Build and run on an Android device (API 24+)

## Installation

For detailed setup instructions, see [SETUP.md](SETUP.md)

---

**Status**: Development in progress
