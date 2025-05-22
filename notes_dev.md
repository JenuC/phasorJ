
## Jenu's Notes May 5 2025

- Maturin develop use development/debug mode by default: Rust library (under target/debug) :
    - change to `maturin develop --release` (for release)
- Maven configuration pom.xml explicitly specifies --release

Basic tests on windows Powershell with OPENJDK21 and uv installed
``` pwsh
.\rust_phasorJ\imgal: cargo test
.\rust_phasorJ\imgal: cargo test -- --nocapture
.\rust_phasorJ\imgal: cargo build
.\rust_phasorJ\imgal: uv venv -p 3.12
.\rust_phasorJ\imgal: .\.venv\Scripts\activate
.\rust_phasorJ\imgal: uv pip install numpy
.\rust_phasorJ\imgal: pwd
.\rust_phasorJ\imgal\imgal_python: cd .\imgal_python\
.\rust_phasorJ\imgal\imgal_python: uv pip install maturin
.\rust_phasorJ\imgal\imgal_python: maturin develop
.\rust_phasorJ\imgal\imgal_python: uv pip list
.\rust_phasorJ\imgal\imgal_python: & ./imgal/.venv/Scripts/python.exe ./imgal/tests/test_statistics.py
.\rust_phasorJ\imgal\imgal_python: & ./imgal/.venv/Scripts/python.exe ./imgal/tests/list_functions.py
.\rust_phasorJ\imgal\imgal_python: & ./imgal/.venv/Scripts/python.exe ./imgal/tests/simple_test.py
.\rust_phasorJ\imgal\imgal_python: & ./imgal/.venv/Scripts/python.exe ./imgal/tests/test_statistics.py
.\rust_phasorJ\imgal\imgal_java\java: cd ..\imgal_java\java
.\rust_phasorJ\imgal\imgal_java\java: mvn test
.\rust_phasorJ\imgal\imgal_java\java: java --version
.\rust_phasorJ\imgal\imgal_java\java: mvn test
.\rust_phasorJ\imgal\imgal_java\java: mvn clean
.\rust_phasorJ\imgal\imgal_java\java: mvn test -DskipRustBuild=true
.\rust_phasorJ\imgal\imgal_java\java: mvn compile
.\rust_phasorJ\imgal\imgal_java\java: mvn package
```