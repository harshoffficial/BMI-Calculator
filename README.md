# BMI Calculator Android App

A modern, animated Android application for calculating Body Mass Index (BMI) with a beautiful user interface and smooth animations.

## 📱 Features

### Core Functionality
- **BMI Calculation**: Calculate BMI using weight and height inputs
- **Multiple Unit Support**: 
  - Weight: kg, pounds, stones
  - Height: cm, feet, meters
- **Real-time Conversion**: Automatic unit conversion for accurate calculations
- **BMI Categories**: Visual reference table showing BMI classifications

### User Interface
- **Animated Splash Screen**: Lottie animations for engaging user experience
- **Modern Design**: Purple/blue gradient theme with semi-transparent elements
- **Responsive Layout**: Optimized for different screen sizes
- **Smooth Animations**: Background Lottie animations for visual appeal

### BMI Categories Display
| BMI Range | Category | Color |
|-----------|----------|-------|
| ≤ 18.4 | Underweight | Light Yellow |
| 18.5 - 24.9 | Normal | Green |
| 25.0 - 39.9 | Overweight | Orange |
| ≥ 40.0 | Obese | Red |

## 📱 UI of the App
https://github.com/harshoffficial/BMI-Calculator/issues/1#issue-3271445429
https://github.com/user-attachments/assets/8fbeb15a-8db8-487a-8002-997851bb10ad

## 🛠️ Technical Stack

- **Language**: Java
- **Minimum SDK**: API 24 (Android 7.0)
- **Target SDK**: API 34 (Android 14)
- **Compile SDK**: API 35
- **Architecture**: Single Activity with Splash Screen
- **UI Framework**: ConstraintLayout
- **Animations**: Lottie (Airbnb)
- **Build System**: Gradle

## 📋 Prerequisites

- Android Studio Arctic Fox or later
- Android SDK API 24+
- Java Development Kit (JDK) 11
- Gradle 8.9+

## 🚀 Installation & Setup

### 1. Clone the Repository
```bash
git clone https://github.com/yourusername/bmi-calculator.git
cd bmi-calculator
```

### 2. Open in Android Studio
- Open Android Studio
- Select "Open an existing Android Studio project"
- Navigate to the cloned directory and select it

### 3. Sync Project
- Wait for Gradle sync to complete
- If prompted, update Gradle wrapper version

### 4. Build and Run
- Connect an Android device or start an emulator
- Click the "Run" button (green play icon) or press `Shift + F10`

## 📁 Project Structure

```
app/
├── src/main/
│   ├── java/com/harsh/bmi/
│   │   ├── MainActivity.java          # Main BMI calculation logic
│   │   └── SplashActivity.java        # Animated splash screen
│   ├── res/
│   │   ├── layout/
│   │   │   ├── activity_main.xml      # Main UI layout
│   │   │   └── activity_splash.xml    # Splash screen layout
│   │   ├── values/
│   │   │   ├── strings.xml            # String resources
│   │   │   ├── colors.xml             # Color definitions
│   │   │   └── themes.xml             # App themes
│   │   ├── drawable/                  # Custom drawables
│   │   └── raw/                       # Lottie animation files
│   └── AndroidManifest.xml
└── build.gradle.kts                   # App-level build configuration
```

## 🎨 Key Components

### MainActivity.java
- Handles BMI calculation logic
- Manages unit conversions (feet to meters, pounds to kg, etc.)
- Implements input validation
- Controls UI state and visibility

### SplashActivity.java
- Provides animated splash screen
- Uses Lottie animations for smooth transitions
- Implements proper splash screen lifecycle management

### Layout Files
- **activity_main.xml**: Complex ConstraintLayout with multiple Lottie animations
- **activity_splash.xml**: Full-screen splash with centered animation

## 🔧 Dependencies

```gradle
dependencies {
    implementation 'androidx.appcompat:appcompat:1.6.1'
    implementation 'com.google.android.material:material:1.11.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
    implementation 'androidx.core:core-splashscreen:1.0.0'
    implementation 'com.airbnb.android:lottie:6.4.0'
}
```

## 🚀 Usage

1. **Launch the App**: The app starts with an animated splash screen
2. **Enter Measurements**: 
   - Input your weight in the first field
   - Select weight unit (kg/pounds/stones)
   - Input your height in the second field
   - Select height unit (cm/feet/meters)
3. **Calculate BMI**: Tap the "BMI" button
4. **View Results**: Your BMI value and category will be displayed
5. **Reference Table**: Use the built-in BMI categories table for interpretation

## 🧮 BMI Formula

The app uses the standard BMI formula:
```
BMI = weight (kg) / height (m)²
```

## 🔄 Unit Conversions

The app automatically handles these conversions:
- **Height**: feet → meters (× 0.3048), cm → meters (÷ 100)
- **Weight**: pounds → kg (× 0.453592), stones → kg (× 6.35029)

## 🎯 Future Enhancements

- [ ] Add BMI history tracking
- [ ] Implement dark mode theme
- [ ] Add BMI trend charts
- [ ] Include health recommendations
- [ ] Add multiple language support
- [ ] Implement data export functionality

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Author

**Harsh** - *Initial work* - [Your GitHub Profile]

## 🙏 Acknowledgments

- Lottie animations by [Airbnb](https://lottiefiles.com/)
- Material Design components
- AndroidX libraries

---

⭐ **Star this repository if you found it helpful!**
