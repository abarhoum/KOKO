Register-PSRepository -Name SitecoreGallery -SourceLocation https://sitecore.myget.org/F/sc-powershell/api/v2

Get-Module SitecoreInstallFramework –ListAvailable

Import-Module C:\<CustomLocation>\SitecoreInstallFramework

 Install-SitecoreConfiguration -Path .\prerequisites.json
