[![Ask DeepWiki](https://deepwiki.com/badge.svg)](https://deepwiki.com/Daviddotcoms/Responsive-Icons-App)

# Responsive Icons App

This is a Kotlin project built with **Jetpack Compose** that demonstrates how to properly implement **responsive icons** across various Android screen densities using **drawable** and **mipmap** resources.

## Understanding Screen Densities in Android

Android devices come in a wide range of screen sizes and pixel densities. To ensure UI elements (like icons) look consistent across all devices, Android uses **density buckets** to group screens by their **pixel density**.

**Screen density** refers to the number of physical pixels within a given area (dpi = dots per inch). Android provides density buckets such as:

| Density Bucket  | Scale Factor | Example Size (48dp icon) |
| --------------- | ------------ | ------------------------ |
| mdpi (baseline) | 1.0x         | 48×48 px                 |
| hdpi            | 1.5x         | 72×72 px                 |
| xhdpi           | 2.0x         | 96×96 px                 |
| xxhdpi          | 3.0x         | 144×144 px               |
| xxxhdpi         | 4.0x         | 192×192 px               |

>[!TIP]
> A 48dp icon will be rendered at 96x96 pixels on an xhdpi screen.

## Differences between dp, sp and px units

* **dp (density-independent pixels):** Used for layout dimensions and spacing. 1dp equals 1 pixel on an mdpi screen.
* **sp (scale-independent pixels):** Like dp, but also respects the user’s font size settings. Use it for text.
* **px (pixels):** Absolute pixels, vary depending on screen density. Avoid using px directly in UI.

## Project Setup

In this project, icons are included in both:

### Drawable Folders (for in-app icons)

We place icon images into specific folders based on their size and screen density:

```
res/drawable-mdpi/     → 48x48 px
res/drawable-hdpi/     → 72x72 px
res/drawable-xhdpi/    → 96x96 px
res/drawable-xxhdpi/   → 144x144 px
res/drawable-xxxhdpi/  → 192x192 px
```

Android automatically selects the correct version based on the current screen's density.

### MipMap Folders (for launcher icons)

For **application launcher icons**, use `mipmap-*` folders instead of `drawable-*`.

#### Why use mipmap instead of drawable?
* They ensure better quality on high-density displays and prevent icon blurring or pixelation.

Folders include:

```
res/mipmap-mdpi/
res/mipmap-hdpi/
res/mipmap-xhdpi/
res/mipmap-xxhdpi/
res/mipmap-xxxhdpi/
```

## Best Practices

* Design vector icons if possible (`.xml` via `ImageVector`) for better scalability across all densities.
* Use `dp` for sizing icons in Compose layouts:

  ```kotlin
  Icon(
      painter = painterResource(id = R.drawable.ic_my_icon),
      modifier = Modifier.size(24.dp)
  )
  ```
* Only use `px` for pixel-accurate operations like image processing.

## Architecture
<img width="945" alt="Captura de Pantalla 2025-06-16 a la(s) 15 28 34" src="https://github.com/user-attachments/assets/53da7825-6607-4586-9f62-e650d42cefb8" />
