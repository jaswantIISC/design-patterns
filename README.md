# design-patterns
Explain design patterns with code. It will cover 3 major design patterns creational, behaviour and structrual.

## Singleton Pattern Variants

### 1. Eager Initialization
Instance is created at class loading time, guaranteeing thread safety but potentially wasting resources if the instance is never used.

### 2. Lazy Initialization (Non-Thread-Safe)
Instance is created only when first requested, improving resource usage but unsafe in multi-threaded environments.

### 3. Synchronized Method
`getInstance()` is synchronized to ensure thread safety, but incurs performance overhead due to locking on every call.

### 4. Double-Checked Locking
Uses a synchronized block with two null checks to reduce locking overhead while maintaining thread safety (requires `volatile` instance).



