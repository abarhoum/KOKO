
https://tinyurl.com/ybtqkoa8

Register-PSRepository -Name SitecoreGallery -SourceLocation https://sitecore.myget.org/F/sc-powershell/api/v2

Get-Module SitecoreInstallFramework –ListAvailable

Import-Module C:\<CustomLocation>\SitecoreInstallFramework

 Install-SitecoreConfiguration -Path .\prerequisites.json
 
 https://tinyurl.com/y7rndda3
