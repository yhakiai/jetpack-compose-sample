# CLAUDE.md

## Project Overview

A Jetpack Compose tutorial/sample Android application. The project accompanies an article and demonstrates basic Compose concepts including composable functions, Material Design 3 theming, and preview functionality. Comments are written in Japanese.

## Repository Structure

```
jetpack-compose-sample/
├── CLAUDE.md
├── README.md
└── ComposeTutorial/          # Android project root (open this in Android Studio)
    ├── build.gradle.kts      # Root build file (AGP 8.1.1, Kotlin 1.8.10)
    ├── settings.gradle.kts   # Single module: :app
    ├── gradle.properties
    ├── gradlew / gradlew.bat
    └── app/                  # Single application module
        ├── build.gradle.kts
        └── src/
            ├── main/java/com/example/composetutorial/
            │   ├── MainActivity.kt          # Entry point, MessageCard composable
            │   └── ui/theme/
            │       ├── Color.kt             # Color definitions
            │       ├── Theme.kt             # ComposeTutorialTheme (Material3, dynamic colors)
            │       └── Type.kt              # Typography
            ├── test/                        # Local unit tests (JUnit 4)
            └── androidTest/                 # Instrumented tests (Espresso, Compose UI tests)
```

## Build System

- **Build tool:** Gradle 8.0 with Kotlin DSL (`.gradle.kts`)
- **Android Gradle Plugin:** 8.1.1
- **Kotlin:** 1.8.10
- **Compose Compiler:** 1.4.3
- **Compose BOM:** 2023.03.00
- **compileSdk / targetSdk:** 33
- **minSdk:** 24
- **JVM target:** 1.8

### Build Commands

All Gradle commands must be run from the `ComposeTutorial/` directory:

```bash
cd ComposeTutorial
./gradlew assembleDebug        # Build debug APK
./gradlew assembleRelease      # Build release APK
./gradlew test                 # Run local unit tests
./gradlew connectedAndroidTest # Run instrumented tests (requires device/emulator)
./gradlew lint                 # Run Android lint
```

## Key Dependencies

| Library | Purpose |
|---------|---------|
| androidx.activity:activity-compose | Compose integration with Activity |
| androidx.compose.material3:material3 | Material Design 3 components |
| androidx.compose.ui:ui | Core Compose UI |
| androidx.lifecycle:lifecycle-runtime-ktx | Lifecycle-aware coroutines |
| junit:junit:4.13.2 | Unit testing |
| androidx.test.espresso:espresso-core | UI testing |
| androidx.compose.ui:ui-test-junit4 | Compose UI testing |

## Architecture

This is a minimal tutorial app with no formal architecture pattern (no ViewModel, Repository, etc.). It consists of:

- **`MainActivity`** - Single activity using `setContent` to host composables
- **`MessageCard`** - A simple composable function demonstrating text rendering with background
- **Theme layer** (`ui/theme/`) - Standard Material3 theme setup with dark/light and dynamic color support

## Code Conventions

- **Language:** Kotlin only (no Java source files)
- **Composable functions:** PascalCase (e.g., `MessageCard`, `PreviewMessageCard`)
- **Regular functions/properties:** camelCase
- **Package structure:** `com.example.composetutorial`
- **Code style:** Kotlin official (`kotlin.code.style=official` in gradle.properties)
- **Comments:** Written in Japanese
- **Preview functions:** Prefixed with `Preview` and annotated with `@Preview`

## Testing

- **Unit tests:** `app/src/test/` - Standard JUnit 4 tests
- **Instrumented tests:** `app/src/androidTest/` - AndroidJUnit4 runner with Espresso
- **Compose UI tests:** `ui-test-junit4` dependency available for composable testing
- **Test runner:** `androidx.test.runner.AndroidJUnitRunner`

## CI/CD

No CI/CD pipeline is configured. Build and test locally.

## Notes for AI Assistants

- The Gradle project root is `ComposeTutorial/`, not the repository root. Always `cd ComposeTutorial` before running Gradle commands.
- This is an educational/tutorial project - keep changes simple and focused on learning.
- Preserve Japanese comments when modifying existing code.
- The app uses Material3 (`material3`), not Material2 - use `androidx.compose.material3.*` imports.
- ProGuard/R8 minification is disabled for release builds.
- No version catalog (`libs.versions.toml`) is used - dependencies are declared inline.
