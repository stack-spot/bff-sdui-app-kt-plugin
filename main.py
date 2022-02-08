from pathlib import Path

from templateframework.metadata import Metadata
from templateframework.template import Template
from templateframework.runner import run

def delete_file(path: Path):
    if path.is_file():
        path.unlink()

class DeleteDesignSystemFiles(Template):
    def post_hook(self, metadata: Metadata):
        if not metadata.inputs["configure_design_system"]:
            delete_file(metadata.target_path.joinpath('app', 'design-system.gradle.kts'))
            delete_file(metadata.target_path.joinpath('app', 'ds-schema.json'))
            delete_file(metadata.target_path.joinpath('app', 'run-ds-shema.bat'))
            delete_file(metadata.target_path.joinpath('app', 'run-ds-shema.sh'))

if __name__ == '__main__':
    run(DeleteDesignSystemFiles())
