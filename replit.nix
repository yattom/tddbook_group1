{ pkgs }: {
    deps = [
        pkgs.maven
        pkgs.maven
        pkgs.replitPackages.jdt-language-server
        pkgs.replitPackages.java-debug
    ];
}