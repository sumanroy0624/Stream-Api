# 🌊 Java Stream API Operations — Functional Overview

## 🧱 Stream Pipeline
A Stream pipeline has three stages:
1. **Source** → The data source (List, Set, Array, etc.)
2. **Intermediate Operations** → Transform the stream
3. **Terminal Operations** → Produce the final result

---

## ⚙️ Intermediate Operations

### `filter(Predicate)`
Selects elements that match a given condition.

### `map(Function)`
Transforms each element into another form.

### `flatMap(Function)`
Flattens multiple nested streams into a single stream.

### `distinct()`
Removes duplicate elements from the stream.

### `sorted()`
Sorts elements in natural order.

### `sorted(Comparator)`
Sorts elements using a custom comparator.

### `limit(long n)`
Keeps only the first `n` elements.

### `skip(long n)`
Skips the first `n` elements.

### `peek(Consumer)`
Performs an action (usually for debugging) on each element.

### `mapToInt() / mapToLong() / mapToDouble()`
Converts an object stream to a primitive stream.

### `boxed()`
Converts a primitive stream back to an object stream.

---

## 🎯 Terminal Operations

### `forEach(Consumer)`
Performs an action for each element in the stream.

### `collect(Collector)`
Collects elements into a collection or other data structure.

### `toArray()`
Converts the stream elements into an array.

### `reduce(identity, accumulator)`
Combines elements into a single result (e.g., sum or concatenation).

### `count()`
Returns the total number of elements in the stream.

### `min(Comparator)`
Finds the smallest element according to the comparator.

### `max(Comparator)`
Finds the largest element according to the comparator.

### `findFirst()`
Returns the first element (wrapped in `Optional`).

### `findAny()`
Returns any element (wrapped in `Optional`).

### `anyMatch(Predicate)`
Returns `true` if any element matches the condition.

### `allMatch(Predicate)`
Returns `true` if all elements match the condition.

### `noneMatch(Predicate)`
Returns `true` if no elements match the condition.

---

## 💡 Collectors (Used with `collect()`)

### `toList()`
Collects elements into a `List`.

### `toSet()`
Collects elements into a `Set`.

### `toMap(keyMapper, valueMapper)`
Collects elements into a `Map`.

### `joining(CharSequence delimiter)`
Concatenates strings with a delimiter.

### `counting()`
Counts the number of elements.

### `summarizingInt(ToIntFunction)`
Provides statistical summary (count, sum, min, max, average).

### `groupingBy(Function)`
Groups elements by a classifier function.

### `partitioningBy(Predicate)`
Partitions elements into two groups (true/false).

---

## ⚡ Parallel Streams

### `parallelStream()`
Executes stream operations concurrently using multiple CPU cores.

---

## ✅ Key Points
- Streams are **immutable** and **single-use**.
- Intermediate operations are **lazy**.
- Terminal operations **trigger execution**.
- Source data is **never modified**.
