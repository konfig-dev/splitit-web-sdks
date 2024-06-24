using Splitit.Web.Net.Client;

namespace Splitit.Web.Net.Api
{
    public partial class InstallmentPlanApi : InstallmentPlanApiGenerated {
        public InstallmentPlanApi() : base() {}
        public InstallmentPlanApi(string basePath): base(basePath) {}
        public InstallmentPlanApi(Splitit.Web.Net.Client.Configuration configuration): base(configuration) {}
        public InstallmentPlanApi(Splitit.Web.Net.Client.ISynchronousClient client, Splitit.Web.Net.Client.IAsynchronousClient asyncClient, Splitit.Web.Net.Client.IReadableConfiguration configuration): base(client, asyncClient, configuration) {}
    }
}