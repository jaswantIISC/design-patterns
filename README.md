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

### 5. Static Inner Class (Initialization-on-Demand Holder)
Instance is created when the inner helper class is loaded, providing lazy initialization with thread safety and no synchronization cost.

### 6. Enum Singleton
Uses a single-element enum to guarantee a single instance, inherently thread-safe and protected against serialization and reflection attacks.

### 7. Serialized Singleton
Implements `Serializable` and uses `readResolve()` to ensure deserialization does not create a new instance.

### 8. Clone-Proof Singleton
Overrides `clone()` to prevent duplication of the singleton instance via object cloning.

