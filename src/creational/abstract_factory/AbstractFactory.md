# Abstract Factory Pattern - Simple Explanation

## What Is It?

A factory that creates **groups of related objects** at once.

Think: You have different themes (Light, Dark). Each theme needs buttons, inputs, and dialogs. Instead of creating them separately, you use ONE factory that creates the entire theme family.

---

## Real Example: UI Themes

```
┌─────────────────┐
│  Light Factory  │ ──> LightButton + LightInput + LightDialog
└─────────────────┘

┌─────────────────┐
│  Dark Factory   │ ──> DarkButton + DarkInput + DarkDialog
└─────────────────┘
```

---

## Java Code

### 1. Product Interfaces
```java
public interface Button {
    void render();
}

public interface Input {
    void render();
}
```

### 2. Concrete Products
```java
public class LightButton implements Button {
    public void render() {
        System.out.println("Light Button");
    }
}

public class DarkButton implements Button {
    public void render() {
        System.out.println("Dark Button");
    }
}

public class LightInput implements Input {
    public void render() {
        System.out.println("Light Input");
    }
}

public class DarkInput implements Input {
    public void render() {
        System.out.println("Dark Input");
    }
}
```

### 3. Abstract Factory
```java
public interface ThemeFactory {
    Button createButton();
    Input createInput();
}
```

### 4. Concrete Factories
```java
public class LightFactory implements ThemeFactory {
    public Button createButton() {
        return new LightButton();
    }
    
    public Input createInput() {
        return new LightInput();
    }
}

public class DarkFactory implements ThemeFactory {
    public Button createButton() {
        return new DarkButton();
    }
    
    public Input createInput() {
        return new DarkInput();
    }
}
```

### 5. Use It
```java
public class App {
    public static void main(String[] args) {
        // Light theme
        ThemeFactory factory = new LightFactory();
        Button btn = factory.createButton();
        Input inp = factory.createInput();
        
        btn.render();  // Light Button
        inp.render();  // Light Input
        
        // Switch to dark theme
        factory = new DarkFactory();
        btn = factory.createButton();
        inp = factory.createInput();
        
        btn.render();  // Dark Button
        inp.render();  // Dark Input
    }
}
```

---

## When to Use?

✅ Multiple related objects that go together  
✅ Need to switch between different families  
✅ Want clean, maintainable code

❌ Only one product type  
❌ Simple applications

---

## Real-World Examples

- **Themes** (Light, Dark, High Contrast)
- **Databases** (MySQL, PostgreSQL)
- **Operating Systems** (Windows, Mac, Linux buttons)
- **Payment Gateways** (Stripe, PayPal)

---

## Key Benefit

**Change the entire product family by switching just ONE factory.**

No need to change client code!