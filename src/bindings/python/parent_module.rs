use pyo3::prelude::*;

use super::child_modules;

/// Python binding for the imgal parent module.
#[pymodule(name = "imgal")]
fn imgal_parent_module(m: &Bound<'_, PyModule>) -> PyResult<()> {
    // register child modules
    child_modules::register_integrate_module(m)?;
    child_modules::register_statistics_module(m)?;
    Ok(())
}
